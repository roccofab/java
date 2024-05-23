import java.util.ArrayList;

public class Ward {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Nurses> nurses;
    private ArrayList<Operator> operators;
    private ArrayList<Patient> patients;

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
    public ArrayList<Doctor> getDoctors(){
        return doctors;
    }
    public ArrayList<Nurses> getNurses(){
        return nurses;
    }
    public ArrayList<Operator> getOperators(){
        return operators;
    }

    public ArrayList<Patient> getPatients(){
        return patients;
    }
    public void addDoctor(Doctor doctor){  //add doctor to doctors list
        if(!SearchDoctor(String.valueOf(doctor))){  //if doctor's name is not in the list doctors add him to the list doctors
            doctors.add(doctor);
        }
    }
    public void addNurse(Nurses nurse){  //add nurse to nurses list by name
        if(!SearchNurse(String.valueOf(nurse))){  //if nurse's name is not in the list nurses add him to the list nurses
            nurses.add(nurse);
            nurse.setWard(this);
        }
    }
    public void addOperator(Operator operator){  //add operator to operators list by name
        if(!SearchOperator(String.valueOf(operator))){ //if operator's name is not in the list operators add him to the list operators
            operators.add(operator);
            operator.setWard(this);
        }
    }
    public void addPatient(Patient patient){  // add patient to patients list by Card Number from input
        if(!SearchPatient(String.valueOf(patient))){  //if patient's card number is not in the list patients add the patient to the list patients
            patients.add(patient);
            patient.setWard(this);
        }
    }
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
    public boolean SearchDoctor(String name) {  //search doctor in the list doctors by name
        for (Doctor doctor : doctors) {
            if (doctor.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public boolean SearchNurse(String name){  //search nurse in the list nurses by name
        for (Nurses nurse : nurses) {
            if (nurse.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public boolean SearchOperator(String name){  //search operator in the list operators by name
        for (Operator operator : operators) {
            if (operator.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public boolean SearchPatient(String cardNum) {  //search patient in the list patients by Card Number
        for (Patient patient : patients) {
            if (patient.getCardNumber().equals(cardNum)) {
                return true;
            }
        }
        return false;
    }
}
