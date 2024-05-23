import java.util.Scanner;
public class Conditional5{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("How many Numbers you want to entry: ");
  int nums = sc.nextInt();
  int sum = 0;
  int count = 0;
  for(int i = 0; i < nums; i++){
   System.out.println("Enter Number: ");
   int num = sc.nextInt();
   if(num % 3 == 0){
    sum += num;
    count++;
   }
  }
  System.out.println("You've entered " +count+ " Numbers divisible by 3 and the average is: " +(sum/count));
 }
}