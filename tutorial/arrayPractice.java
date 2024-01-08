import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String [] [] incomingTeam = {
            {"mark", "1600"},
            {"paul", "1600"},
            {"george", "1250"},
            {"stewart", "2500"},
            {"steven", "2100"},
            {"johny", "3400"}
        };
       int maxSalary = Integer.MIN_VALUE;
       int minSalary = Integer.MAX_VALUE;
       String nameMaxSalary = " ";
       String nameMinSalary = " ";

       for(int i = 0; i < incomingTeam.length; i++) {
        String name = incomingTeam[i] [0];
        String salary = incomingTeam[i] [1];
        System.out.println( " \n\t" +name + " earn: " +salary+ " $ per month\n");
       }

       for(int p = 0; p < incomingTeam.length; p++) {
        String name = incomingTeam[p] [0];
        int salary = Integer.parseInt(incomingTeam [p] [1]);

        if(salary < minSalary) {
            minSalary = salary;
            nameMinSalary = name;
        }
        if(salary > maxSalary) {
            maxSalary = salary;
            nameMaxSalary = name;
        }
       }
       System.out.println(nameMaxSalary+ " earns more than everyone: " +maxSalary+ "$ per month\n");
       System.out.println(nameMinSalary+ " earns less than everyone: " +minSalary+ "$ per month\n");

       System.out.println("enter the name of team's member: ");
       String enteredName = input.nextLine();
    }
}