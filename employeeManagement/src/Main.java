import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team team = new Team();
        team.printListEmployees();
        while (true) {
            System.out.println("Do you want to add a new employee? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("no")) {
                break;
            }

            if (!response.equals("yes")) {
                continue;
            }

            System.out.println("Name Employee(stop to exit): ");
            String name = new Scanner(System.in).nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.println("Surname Employee(stop to exit): ");
            String surname = new Scanner(System.in).nextLine();
            if (surname.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.println("Enter salary(0 to exit): ");
            double salary = new Scanner(System.in).nextDouble();
            if (salary == 0) {
                break;
            }

            Employee employee = new Employee(name, surname, salary);
            System.out.println(employee.toString());
            team.addEmployee(employee);

        }
        team.loadEmployee();
        team.saveEmployee();
    }

}