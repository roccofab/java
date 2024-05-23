//print reverse number
import java.util.Scanner;
import java.util.*;
class LoopChallenge5{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Number: ");
 int num = sc.nextInt();
 int rev = 0;
 while(num > 0){
   int digit = num%10;
   rev = rev * 10 + digit;
   num /= 10; 
  }
  System.out.println(rev);
 }
}