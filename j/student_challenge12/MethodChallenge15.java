public class MethodChallenge15{
 public static void replaceChar(String str, char c, char newC){
  StringBuilder newStr = new StringBuilder();
  for(int i = 0; i < str.length(); i++){
    if(str.charAt(i) == c){
     newStr.append(newC);
   } else{
     newStr.append(str.charAt(i));
   }
  }
  System.out.println("String with replaced character: " +newStr);
 }
 public static void main(String[] args){
  String str = "good morning";
  char c = 'g';
  char newChar = 'f';
  System.out.println("Original String: " +str);
  replaceChar(str, c, newChar);
 }
}