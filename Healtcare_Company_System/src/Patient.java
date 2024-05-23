public class Patient {
    private String CardNumber;
    private Ward ward;
    Doctor personalDoctor;
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
    public void setWard(Ward ward) {
        this.ward = ward;
    }
    public Ward getWard() {
        return ward;
    }
    public String toString(){
        return "Patient[Card Number: " +CardNumber+ " -Hospitalized: " +ward.getName()+ "]";
    }
}
