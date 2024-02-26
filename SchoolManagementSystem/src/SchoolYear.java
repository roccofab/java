import java.io.Serializable;

public class SchoolYear implements Serializable {

    private int year;

    public SchoolYear(int year) {   //constructor of the class SchoolYear
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Year School: " + year;
    }
}
