import java.util.Scanner;
public class exer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boxPrice = 7.98;
        int number = 0;
        System.out.println("\t\t\tMORE BOXES, LESS MONEY!!\n\n");
        System.out.println("How many boxes did you get? ");
         number = input.nextInt();
       
        if(number < 3) {
            boxPrice *= number;
            System.out.println(boxPrice);
        } else if(number <= 10 && number >= 3 ) {
            number--;
            boxPrice *= number;
            System.out.println(boxPrice);
        } else if( number >= 50 && number < 100) {
            number -=10;
            boxPrice *= number;
            System.out.println(boxPrice);
        } else if(number >= 100) {
            System.out.println("We need 1 week to get so many boxes!");
        }
    
    }
}