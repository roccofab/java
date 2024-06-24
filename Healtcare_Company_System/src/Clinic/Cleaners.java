package Clinic;

/**
 * The class represent a cleaner of the entire Healtcare Company, a cleaner is not assigned to a specific ward,
 * but he is assigned to the entire Company
 * the class provides methods to retrieve cleaner's name and to get a string that represent the cleaner
 */
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
