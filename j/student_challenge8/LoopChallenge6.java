import java.util.Scanner;
import java.util.*;
class LoopChallenge6{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Number: ");
  int num = sc.nextInt();
  int temp = num;
  int rev = 0;
  while(temp != 0){
   int digit = temp % 10;
   rev = rev * 10 + digit;
   temp = temp / 10;
  }
  System.out.println("The reverse Number is: " +rev);
  if(rev == num){
   System.out.println("Palindrome Number");
  } else{
    System.out.println("Not Palindrome Number");
  }
 }
}