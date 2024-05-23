import java.util.Scanner;
public class Conditional2{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("How many Numbers You Need to entry: ");
   int numbers = sc.nextInt();
   boolean even = true;
   int countOdd = 0;
   int countEven = 0;
   for(int i = 0; i < numbers; i++){
     System.out.println("Enter Number: ");
     int num = sc.nextInt();
     if(num % 2 != 0){
      even = false;
      countOdd++;
    } else{
      countEven++; 
    }
  }
  if(even){
   System.out.println("You've entered " +countEven+ " even numbers");
  } else{
    System.out.println("You've entered " +countOdd+ " Odd Numbers");
  }
 }
}