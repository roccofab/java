
import java.io.Serializable;

public class Teacher implements Serializable {


    private String name;
    private String subject;

    public Teacher(String name, String subject) {   //constructor for the class Teacher
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return name + "-" + subject;
    }
}
