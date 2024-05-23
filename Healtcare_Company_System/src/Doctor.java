public class Doctor {
    private String name;
    private Ward ward;
    public Doctor(String name, Ward ward) {
        this.name = name;
        this.ward = ward;
    }

    public String getName() {
        return name;
    }
    public void setWard(Ward ward) {
        this.ward = ward;
    }
    public Ward getWard() {
        return ward;
    }
    public String toString(){
        return "Doctor[name: " + name + " -Ward: " + ward.getName()+ "]";
    }
}
