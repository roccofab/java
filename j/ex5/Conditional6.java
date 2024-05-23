import java.util.Scanner;
public class Conditional6{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  for(int i = 0; i < 5; i++){
   System.out.println("How many characters you want to entry: ");
   int num = sc.nextInt();
   for(int j = 0; j < num; j++){
    System.out.println("Enter Character: ");
    char c = sc.next().charAt(0);
    System.out.println(c);
   }
  }
 }
}