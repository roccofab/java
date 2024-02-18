import java.io.*;
import java.util.ArrayList;
public class Team {
    private ArrayList<Employee> employees;
    private String filename = "dipendenti.txt";

    public Team() {
        this.employees = new ArrayList<>();
        loadEmployee();
    }

    public void addEmployee(Employee employee) {  //Add employee from the list
        employees.add(employee);
        saveEmployee(employees);
    }

    public void removeEmployee(Employee employee) {  //remove employee from the List
        employees.remove((employee));
        saveEmployee(employees);
    }

    public double SalaryTotal() {    //calculate the total salary
        double tot = 0;
        for (Employee employee : employees) {
            tot += employee.getSalary();
        }
        return tot;
    }

    public void loadEmployee() {    //Constructor of the class Team it upload the saved employees from the file filename the employees are saved in the list from the method saveEmployee
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {  //ObjectInputStream read data from the filename
            Object obj = ois.readObject();
            if (obj instanceof ArrayList) {
                employees = (ArrayList<Employee>) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            // ignore if the file does not exist or cannot be read
        }
    }
        public void saveEmployee() {     //Save the list of employees in the file filename
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {   //ObjectOutputStream write data to the filename
                oos.writeObject(employees);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printListEmployees() {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }

    public void saveEmployee(Object employees) {     //Save the list of employees in the file filename
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {   //ObjectOutputStream write data to the filename
            oos.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


