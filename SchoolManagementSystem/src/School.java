
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
public class School implements Serializable {

    private List< Class > classes;
    private List< SchoolYear > schoolYears;
    public School() {    //constructor for the class School
        this.classes = new ArrayList<>();
        this.schoolYears = new ArrayList<>();
    }
    public void addClass(Class c) {
        classes.add(c);
    }
    public void removeClass(Class c) {
        classes.remove(c);
    }
    public void addSchoolYear(SchoolYear s) {
        schoolYears.add(s);
    }

    public void printClasses() {
        for(Class c : classes) {
            System.out.println(" " +c);
        }
    }
    public List<Class> getClasses() {
        return classes;
    }
    public void removeStudentFromAllClasses(String studentName) {
        for (Class c : classes) {
            c.removeStudent(studentName);
        }
    }
    public void removeTeacherFromAllClasses(String teacherName) {
        for (Class c : classes) {
            c.removeTeacher(teacherName);
        }
    }

    public void saveData() {   //write data to dataSchool.txt using the class  ObjectOutputStream
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("dataSchool.txt"))) {
            out.writeObject(schoolYears);   //write thelist of school year to dataSchool.txt
            out.writeObject(classes); //write the list of school classes to dataSchool.txt
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void uploadData() {   //read data from dataSchool.txt using the class ObjectInputStream
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("dataSchool.txt"))) {
            schoolYears = (List< SchoolYear >) in.readObject();  //read the list of school years
            classes= (List< Class >) in.readObject();  //read the list of school classes
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void deleteData() {
        schoolYears.clear();
        classes.clear();
        System.out.println("Deleted Data.");
    }

  public void showSchoolYearInfo(int targetYear) {   //method to print details about year of school(1,2,3) from input
      for (Class c : classes) {
          SchoolYear year = c.year;
          if (year.getYear() == targetYear) {
              System.out.println("Class: " + c.getName());
              System.out.println("Students:");
              for (Student student : c.getStudentList()) {
                  System.out.println(" - " + student); // Print student details
              }
              System.out.println("Teachers:");
              for (Teacher teacher : c.getTeachersList()) {
                  System.out.println("  - " + teacher); // Print teacher details
              }
          }
      }
  }
}
