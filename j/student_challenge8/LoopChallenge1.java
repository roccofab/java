import java.util.Scanner;
import java.util.*;
class LoopChallenge1{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Number: ");
   int num = sc.nextInt();
   for(int i = 1; i <= 10; i++){
    System.out.println(num*i);
  }
 }
}