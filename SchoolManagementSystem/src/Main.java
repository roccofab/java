import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School newSchool = new School();
        newSchool.uploadData();
        int choice;
        do{
            System.out.println("1. Create a new Class(press 1): ");
            System.out.println("2. Modify Class(press 2): ");
            System.out.println("3. Show class Details(press 3): ");
            System.out.println("4. Save Data(press 4): ");
            System.out.println("5. Delete all Data(press 5): ");
            System.out.println("6. Exit(press 6): ");
            choice = scanner.nextInt();
           /* create a new object school year and then add the year of the class(1,2,3) and generate a new object newClass from the class Class
           * with the attributes className and schoolYear */
            switch(choice) {
                case 1:
                    System.out.println("Enter the class Name(ex: 1A, 2B, 3D....): ");
                    String className = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter year of the Class(1,2,3): ");
                    int classYear = scanner.nextInt();
                    scanner.nextLine();

                    SchoolYear schoolYear = new SchoolYear(classYear);
                    Class newClass = new Class(className, schoolYear);
                    newSchool.addClass(newClass);

                    int addChoice;
                    do{
                        System.out.println("1. Add a new Student(press 1): ");
                        System.out.println("2. Add a new Teacher(press 2): ");
                        System.out.println("0. Stop(press 0): ");
                        addChoice = scanner.nextInt();


                       //create new student using the method createStudent and then add him to the newClass
                        switch(addChoice) {
                            case 1:
                                Student student = Class.createStudent(scanner);
                                newClass.addStudent(student);
                                break;
                         //create a new teacher using the method createTeacher and then add him to the newClass
                            case 2:
                                Teacher teacher = Class.createTeacher(scanner);
                                newClass.addTeacher(teacher);
                                break;

                            case 0:
                                break;
                        }
                    } while(addChoice != 0);
                    break;

                case 2:
                    System.out.println("Enter the Name of the Class to Modify: ");
                    int targetName = scanner.nextInt();
                    System.out.println("Enter the Year of the Class to Modify: ");
                    int targetYear = scanner.nextInt();
                    newSchool.showSchoolYearInfo(targetYear);
                    int removeChoice;
                    Class targetClass = null;
                    for (Class c : newSchool.getClasses()) {
                        if (c.getName().equalsIgnoreCase(Integer.toString(targetName)) && c.getYear().getYear() == targetYear) {
                            targetClass = c;
                            break;
                        }
                    }

                    if (targetClass != null) {

                        do {
                            System.out.println("1. Add Teacher(press1): ");
                            System.out.println("2. Add Student(press 2): ");
                            System.out.println("3. Remove Student(press 3): ");
                            System.out.println("4. Remove Teacher(press 4): ");
                            System.out.println("0. Exit(press 0): ");
                            removeChoice = scanner.nextInt();
                            scanner.nextLine();
                            switch (removeChoice) {
                                case 1:
                                 targetClass.addNewTeacherToClass(scanner);
                                 break;

                                case 2:
                                    targetClass.addNewStudentToClass(scanner);
                                    break;

                                case 3:
                                    System.out.println("Enter Student Name: ");
                                    String nameToRemove = scanner.nextLine();
                                    targetClass.removeStudent(nameToRemove);  //remove student from the class
                                    break;

                                case 4:
                                    System.out.println("Enter Teacher Name: ");
                                    String teacherToRemove = scanner.nextLine();
                                    targetClass.removeTeacher(teacherToRemove);  //remove teacher from the class
                                    break;

                                case 0:
                                    break;
                            }

                        } while (removeChoice != 0);
                    }
                case 3:
                    //Check all details about class from input using the method showSchoolYearInfo of the class School
                    System.out.println("Enter the Year of the Class to check Details: ");
                    int yearTarget = scanner.nextInt();
                    newSchool.showSchoolYearInfo(yearTarget);
                    break;

                case 4:
                    newSchool.saveData();   //save data to the file dataSchool.txt using the ObjectOutputStream from the class School
                    break;

                case 5:
                    newSchool.deleteData();
                    break;

                case 6:
                    System.exit(0);  //exit
                    break;
            }
        }while(choice != 0);
        newSchool.saveData();
        scanner.close();

    }
}