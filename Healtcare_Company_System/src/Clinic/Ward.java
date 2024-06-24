package Clinic;
import java.util.ArrayList;
/**
 * The Ward class represents a hospital ward with its specific properties and personnel.
 * It manages lists of doctors, nurses, operators, and patients assigned to the ward.
 */

public class Ward {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Nurses> nurses;
    private ArrayList<Operator> operators;
    private ArrayList<Patient> patients;
    /**
     * Constructs a Ward object with the specified name and initializes empty lists for doctors, nurses, operators, and patients.
     *
     * @param name the name of the ward
     */

    public Ward(String name){
        this.name = name;
        doctors = new ArrayList<Doctor>();
        nurses = new ArrayList<Nurses>();
        operators = new ArrayList<Operator>();
        patients = new ArrayList<Patient>();
    }
    public String getName(){
        return name;
    }
    /**
     * Retrieves the list of doctors assigned to the ward.
     *
     * @return an ArrayList of Doctor objects
     */
    public ArrayList<Doctor> getDoctors(){
        return doctors;
    }
    /**
     * Retrieves the list of nurses assigned to the ward.
     *
     * @return an ArrayList of Nurses objects
     */
    public ArrayList<Nurses> getNurses(){
        return nurses;
    }
    /**
     * Retrieves the list of operators assigned to the ward.
     *
     * @return an ArrayList of Operator objects
     */
    public ArrayList<Operator> getOperators(){
        return operators;
    }

    /**
     * Retrieves the list of patients currently admitted to the ward.
     *
     * @return an ArrayList of Patient objects
     */
    public ArrayList<Patient> getPatients(){
        return patients;
    }
    /**
     * Adds a doctor to the list of doctors assigned to the ward if not already present.
     *
     * @param doctor the Doctor object to add
     */
    public void addDoctor(Doctor doctor){  //add doctor to doctors list
        if(!SearchDoctor(String.valueOf(doctor))){  //if doctor's name is not in the list doctors add him to the list doctors
            doctors.add(doctor);
        }
    }
    /**
     * Adds a nurse to the list of nurses assigned to the ward if not already present.
     * Also sets the ward for the nurse to this ward.
     *
     * @param nurse the Nurses object to add
     */
    public void addNurse(Nurses nurse){  //add nurse to nurses list by name
        if(!SearchNurse(String.valueOf(nurse))){  //if nurse's name is not in the list nurses add him to the list nurses
            nurses.add(nurse);
            nurse.setWard(this);
        }
    }
    /**
     * Adds an operator to the list of operators assigned to the ward if not already present.
     * Also sets the ward for the operator to this ward.
     *
     * @param operator the Operator object to add
     */
    public void addOperator(Operator operator){  //add operator to operators list by name
        if(!SearchOperator(String.valueOf(operator))){ //if operator's name is not in the list operators add him to the list operators
            operators.add(operator);
            operator.setWard(this);
        }
    }
    /**
     * Adds a patient to the list of patients admitted to the ward if not already present.
     * Also sets the ward for the patient to this ward.
     *
     * @param patient the Patient object to add
     */
    public void addPatient(Patient patient){  // add patient to patients list by Card Number from input
        if(!SearchPatient(String.valueOf(patient))){  //if patient's card number is not in the list patients add the patient to the list patients
            patients.add(patient);
            patient.setWard(this);
        }
    }
    /**
     * Removes a doctor from the list of doctors assigned to the ward by name.
     *
     * @param name the name of the doctor to remove
     */
    public void removeDoctor(String name){  //remove doctor from doctors list
            Doctor doctorToRemove = null;
            for(Doctor doc : doctors){
                if(doc.getName().equalsIgnoreCase(name)){
                    doctorToRemove = doc;
                    break;
                }
            }
            if(doctorToRemove!= null){
                doctors.remove(doctorToRemove);
                System.out.println(doctorToRemove + " REMOVED ");
            } else{
                System.out.println("Doctor not found");
            }
    }
    /**
     * Removes a nurse from the list of nurses assigned to the ward by name.
     *
     * @param name the name of the nurse to remove
     */
    public void removeNurse(String name){  //remove nurse from nurses list
        Nurses nurseToRemove = null;
        for(Nurses nur : nurses){
            if(nur.getName().equalsIgnoreCase(name)){
                nurseToRemove = nur;
                break;
            }
        }
        if(nurseToRemove!= null){
            nurses.remove(nurseToRemove);
            System.out.println(nurseToRemove + " REMOVED ");
        } else{
            System.out.println("Nurse not found");
        }
    }
    /**
     * Removes an operator from the list of operators assigned to the ward by name.
     *
     * @param name the name of the operator to remove
     */
    public void removeOperator(String name){  //remove operator from operators list
        Operator operatorToRemove = null;
        for(Operator op : operators){
            if(op.getName().equalsIgnoreCase(name)){
                operatorToRemove = op;
                break;
            }
        }
        if(operatorToRemove!= null){
            operators.remove(operatorToRemove);
            System.out.println(operatorToRemove + " REMOVED ");
        } else {
            System.out.println("Operator not found");
        }
    }
    /**
     * Removes a patient from the list of patients admitted to the ward by card number.
     *
     * @param cardNum the card number of the patient to remove
     */
    public void removePatient(String cardNum){  //remove patient from patients list
        Patient patientToRemove = null;
        for(Patient pat : patients){
            if(pat.getCardNumber().equalsIgnoreCase(cardNum)){
                patientToRemove = pat;
                break;
            }
        }
        if(patientToRemove!= null){
            patients.remove(patientToRemove);
            System.out.println(patientToRemove + " REMOVED ");
        } else {
            System.out.println("Patient not found");
        }
    }
    /**
     * Searches for a doctor in the list of doctors assigned to the ward by name.
     *
     * @param name the name of the doctor to search for
     * @return true if the doctor is found, false otherwise
     */
    public boolean SearchDoctor(String name) {  //search doctor in the list doctors by name
        for (Doctor doctor : doctors) {
            if (doctor.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Searches for a nurse in the list of nurses assigned to the ward by name.
     *
     * @param name the name of the nurse to search for
     * @return true if the nurse is found, false otherwise
     */
    public boolean SearchNurse(String name){  //search nurse in the list nurses by name
        for (Nurses nurse : nurses) {
            if (nurse.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Searches for an operator in the list of operators assigned to the ward by name.
     *
     * @param name the name of the operator to search for
     * @return true if the operator is found, false otherwise
     */
    public boolean SearchOperator(String name){  //search operator in the list operators by name
        for (Operator operator : operators) {
            if (operator.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Searches for a patient in the list of patients admitted to the ward by card number.
     *
     * @param cardNum the card number of the patient to search for
     * @return true if the patient is found, false otherwise
     */
    public boolean SearchPatient(String cardNum) {  //search patient in the list patients by Card Number
        for (Patient patient : patients) {
            if (patient.getCardNumber().equals(cardNum)) {
                return true;
            }
        }
        return false;
    }
}
