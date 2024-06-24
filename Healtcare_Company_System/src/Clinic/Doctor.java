package Clinic;

/**
 *The class represent information about a doctor of a specific ward of the Healtcare_Company
 * The class provides methods to retrieve and update the doctor's name and assigned ward.
 */
public class Doctor {
    private String name;
    private Ward ward;

    /**
     *
     * @param name
     * @param ward the ward to which the doctor is assigned
     */
    public Doctor(String name, Ward ward) {
        this.name = name;
        this.ward = ward;
    }

    public String getName() {
        return name;
    }
    /**
     * Sets the ward to which the doctor is assigned.
     *
     * @param ward the new ward for the doctor
     */
    public void setWard(Ward ward) {
        this.ward = ward;
    }
    public Ward getWard() {
        return ward;
    }

    /**
     * @return  a string representation of the doctor.
     */
    public String toString(){
        return "Doctor[name: " + name + " -Ward: " + ward.getName()+ "]";
    }
}
