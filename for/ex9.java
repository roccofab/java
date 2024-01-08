import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double values;
        double mediumT = 0;
        for(int i = 1; i <= 6; i++) {
        
        System.out.println("\n\n\tEnter Day " +i+ " Temperature(°C): ");
         values = input.nextDouble();

        
         }
           if(i == 6) {
            mediumT = values / i;
            System.out.println("The medium Temperature is: " +mediumT);
         } 
    } 
    
}