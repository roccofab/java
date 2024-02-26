import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class implements Serializable {

    private String name;
    SchoolYear year;
    private List<Student> students;
    private List<Teacher> teachers;

    public Class(String name, SchoolYear year) {   //Constructor for the class Class
        this.name = name;
        this.year = year;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String studentName) {    //remove student from input name
        students.removeIf(student -> student.getName().equals(studentName));
    }

    public List< Student > getStudentList() {
        return students;
    }
    public static Student createStudent(Scanner scanner) {   //method to create a new student and then add him to the object class using the method addStudent
        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Year of Birth:");
        String yearBirth = scanner.nextLine();
        System.out.println("Enter Average Grades:");
        double averageGrades = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name, yearBirth, averageGrades);
    }

    public static Teacher createTeacher(Scanner scanner) {   //method to create a new teacher object and then add him to the object class using the method addTeacher
        System.out.println("Enter Teacher Name:");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Subject:");
        String subject = scanner.nextLine();

        return new Teacher(name, subject);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addNewStudentToClass(Scanner scanner) {
        Student newStudent = createStudent(scanner);
        addStudent(newStudent);
    }

    public void addNewTeacherToClass(Scanner scanner) {
        System.out.println("Enter the Name of the New Teacher: ");
        String name = scanner.nextLine();
        System.out.println("Enter Subject: ");
        String subject = scanner.nextLine();

        Teacher newTeacher = new Teacher(name, subject);
        addTeacher(newTeacher);

        System.out.println("New Teacher added to the class.");
    }

    public void removeTeacher(String teacherName) {
        teachers.removeIf(teacher -> teacher.getName().equals(teacherName));
    }
    public List<Teacher> getTeachersList() {
        return teachers;
    }

    public String getName() {
        return name;
    }

    public SchoolYear getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "Class: " + name + "-Year: " + year;
    }
}