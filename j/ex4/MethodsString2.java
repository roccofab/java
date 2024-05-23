import java.util.Scanner;
public class MethodsString2{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
   System.out.println("Enter String: ");
   String word = sc.nextLine();
   for(int i = word.length()-1; i >= 0; i--){
    System.out.print(word.charAt(i));
  }
 }
}