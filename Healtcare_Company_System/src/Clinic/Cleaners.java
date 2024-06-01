package Clinic;
public class Cleaners {
    private String name;

    public Cleaners(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "Cleaners: " +name;
    }
}
