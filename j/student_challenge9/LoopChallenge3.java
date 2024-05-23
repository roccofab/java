//geometric progression
import java.util.Scanner;
class LoopChallenge3{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number of progression: ");
  int a = sc.nextInt();
  System.out.println("Enter the Common Value: ");  //a is multiplied by the common value in each iteration
  int c = sc.nextInt();
  System.out.println("Enter number of terms: ");
  int l = sc.nextInt();
  System.out.println("Geometric Progression:");
  for(int i = 0; i < l; i++){
   System.out.print(a);
   a *= c;
   if(i < l -1){
    System.out.print(",");
   }
  }   
 }
}