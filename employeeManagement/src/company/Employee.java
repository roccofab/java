package company;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;

public class Employee implements Serializable {   //Employee class implements serializable interface in order to save and load the data from the file
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }
    public String setSurname(String surname) {
        this.surname = surname;
        return this.surname;
    }
    public double setSalary(double salary) {
        this.salary = salary;
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {    //print employee information using method toString()
        return "Employee " +name+ "\nSurname: " +surname+ "\nSalary: " +salary+ "\n";
    }
}
