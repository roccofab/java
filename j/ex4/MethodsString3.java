import java.util.Scanner;
public class MethodsString3{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter String: ");
  String word = sc.nextLine();
  StringBuilder vowels = new StringBuilder();
  for(int i = 0; i < word.length(); i++){
    char c = word.charAt(i);
    if(Character.toString(c).matches("[aeiouAEIOI]")){
      vowels.append(c);
   }
  }
   System.out.println(vowels);
 }
}