//Fibonacci progression
import java.util.Scanner;
class LoopChallenge4{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of terms: ");
  int l = sc.nextInt();
  int a = 0;
  int b = 1;
  System.out.println("Fibonacci Progression:");
  System.out.print(a+ "," +b+ ",");
  for(int i = 0; i < l-2; i++){
    int c = a + b;
    System.out.print(c+ ",");
    a = b;
    b = c;
   }
 }
}