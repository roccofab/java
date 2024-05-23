import java.util.Scanner;
public class MethodsString6{
 public static void Repeat(int num, String str){
   if(num < 0){
    System.out.println("Negative Number");
  } else{
    for(int i = 0; i < num; i++){
     System.out.println(str);
   }
  }
 }
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Number: ");
  int num = sc.nextInt();
  sc.nextLine();
  System.out.println("Enter string to repeat " +num+ " times: ");
  String word = sc.nextLine();
  Repeat(num, word);
 }
}