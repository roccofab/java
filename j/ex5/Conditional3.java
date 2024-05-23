//continue to enter numbers till you enter a number that is less than 0 and divisible by 2 or you enter a number that is greater
//than 0 and divisible by 3, finally you get the sum of the numbers that doesn't satisfy condition
import java.util.Scanner;
public class Conditional3{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   boolean valid = false;
   int sum = 0;
   do{
    System.out.println("Enter Number: ");
    int num = sc.nextInt();
    if(num < 0 && num % 2 == 0 || num > 0 && num % 3 == 0){
      valid = true;
   }
   if(!valid){
    sum += num;
  }
  }while(!valid);
  System.out.println("Sum of Numbers: " +sum);
 }
}