//count digits of a number
import java.util.Scanner;
import java.util.*;
class LoopChallenge4{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Number: ");
   int n = sc.nextInt();
   int counter = 0;
   while(n != 0){
   n /= 10;
   counter++;  
  } 
  System.out.println("The number has " +counter+ " Digits");
 }
}