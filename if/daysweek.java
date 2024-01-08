import java.util.Scanner;

public class daysweek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] DayWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday"};
        System.out.println("Enter number from 1 to 7: ");
        int number = input.nextInt();
        if(number >= 1 && number <= 7) {
            String Day = DayWeek[number - 1];
            System.out.println(number+  " corresponds to: " +Day);
        }  else {
            System.out.println("You have to enter a number from 1 to 7!");
        }
    }
}