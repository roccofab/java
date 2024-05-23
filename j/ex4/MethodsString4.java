//count special characters from a sequence of strings
import java.util.Scanner;
public class MethodsString4{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter String Sequence that contains special characters(.,:;!?)");
  String sequence = sc.nextLine();
  int count = 0;
  for(int i = 0; i < sequence.length(); i++){
    char c = sequence.charAt(i);
    if(Character.toString(c).matches("[.,:;!?]+")){
     count++;
   }
  }
   System.out.println(+count+ " Special Characters");
 }
}