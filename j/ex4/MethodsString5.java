//count the number of empty spaces followed by a vowel
import java.util.Scanner;
public class MethodsString5{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter String with empty spaces: ");
  String word = sc.nextLine();
  int count = 0;
  int currentC = word.indexOf(" ");
  for(int i = 0; i < word.length()-1; i++){
    if(word.charAt(i) == ' ' && Character.toString(word.charAt(i + 1)).matches("[aeiouAEIOU]")){
     count++;
   }
  }
   System.out.println("There are " +count+ " empty spaces followed by a vowel");
 }
}
