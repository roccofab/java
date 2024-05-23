//aritmetic progression
import java.util.Scanner;
class LoopChallenge2{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first number of progression: ");
   int a = sc.nextInt();
   System.out.println("Enter common difference between one number and the next number: ");
   int d = sc.nextInt();
   System.out.println("Enter how many terms in the progression: ");
   int l = sc.nextInt();
   System.out.println("Aritmetic Progression:");
   for(int i = 0; i < l; i++){
    System.out.print(a);
    if(i < l - 1){
     System.out.print(",");
    } 
    a += d;   //add the common difference to A at each iteration
  }
 }
}