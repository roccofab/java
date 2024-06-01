
import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private String yearBirth;
    private double averageGrades;

    public Student(String name, String yearBirth, double averageGrades) {  //Constructor for the class Student
        this.name = name;
        this.yearBirth = yearBirth;
        this.averageGrades = averageGrades;
    }
    public String getName() {
        return name;
    }
    public String getYearBirth() {
        return yearBirth;
    }
    public double getAverageGrades() {
        return averageGrades;
    }

    @Override
    public String toString() {
        return"Name: " + name + " - Year Birth: " + yearBirth + " - Average Grades: " +averageGrades;
    }

}
