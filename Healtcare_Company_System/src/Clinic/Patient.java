package Clinic;

/**
 * The Patient class represents a patient in a clinic. Each patient has a unique card number,
 * is assigned to a specific ward, and has a personal doctor.
 * <p>
 * The class provides methods to retrieve and update the patient's card number, ward, and personal doctor.
 * </p>
 */
public class Patient {
    private String CardNumber;
    private Ward ward;
    Doctor personalDoctor;

    /**
     *
     * @param CardNumber the unique card number of the patient
     * @param ward the ward to which the patient is assigned
     * @param personalDoctor the personal doctor assigned to the patient
     */
    public Patient(String CardNumber,Ward ward, Doctor personalDoctor) {
        this.CardNumber = CardNumber;
        this.ward = ward;
        this.personalDoctor = personalDoctor;
    }
    public String getCardNumber() {
        return CardNumber;
    }
    public Doctor getPersonalDoctor() {
        return personalDoctor;
    }
    /**
     * Sets the ward to which the patient is assigned.
     *
     * @param ward the new ward for the patient
     */
    public void setWard(Ward ward) {
        this.ward = ward;
    }
    public Ward getWard() {
        return ward;
    }

    /**
     *
     * @return a string representation of the patient.
     */
    public String toString(){
        return "Patient[Card Number: " +CardNumber+ " -Hospitalized: " +ward.getName()+ "]";
    }
}
