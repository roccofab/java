public class Nurses {
    private String name;
    private Ward ward;

    public Nurses(String name, Ward ward) {
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
        return "Nurse[name: " +name+ " -Ward: " +ward.getName()+ " ]";
    }
}
