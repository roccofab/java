import java.util.Scanner;
import java.util.*;
class LoopChallenge3{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number: ");
  int num = sc.nextInt();
int factorial = 1;
  for(int i = 1; i <= num; i++){
    factorial *=i;
  }
  System.out.println("The Factorial is: " +factorial);
 }
}