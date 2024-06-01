//remove character from a string
public class MethodChallenge14{
 public static void removeChar(String str, char c){
  String newStr = "";
  for(int i = 0; i < str.length(); i++){
   if(str.charAt(i) != c){
     newStr += str.charAt(i);
   }
  }
   System.out.println(newStr);
 }
 public static void main(String[] args){
  char c = 'a';
  String str = "alabama";
  removeChar(str, c);
 }
}