import java.util.Scanner;
public class MethodsChallenge13{
 public static String Concatenation(String str1, String str2, String str3){
   return str1 + "*" + str2+ "*" + str3;
 }
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Three Strings: ");
   String str1 = sc.nextLine();
   String str2 = sc.nextLine();
   String str3 = sc.nextLine();
   System.out.println(Concatenation(str1, str2, str3));
 }
}
