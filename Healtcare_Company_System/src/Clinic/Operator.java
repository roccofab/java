package Clinic;

/**
 * The class represent an operator for a specific ward
 * It provides methods to retrieves Operator's name, ward's name where he is assigned, assign him to a specific ward
 * and get a string representation of Operator
 */
public class Operator {
    private String name;
    private Ward ward;

    public Operator(String name, Ward ward) {
        this.name = name;
        this.ward = ward;
    }

    public String getName() {
        return name;
    }
    public Ward getWard() {
        return ward;
    }
    public void setWard(Ward ward) {
        this.ward = ward;
    }
    public String toString(){
        return "Operator[name: " +name+ " -Ward: " +ward.getName()+ " ]";
    }
}
