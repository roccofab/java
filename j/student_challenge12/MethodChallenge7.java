class MethodChallenge7{
  static boolean Validate(String name){
   return name.matches("[a-zA-Z//s]+");
 }
  static boolean Validate(int age){
   return age > 0 && age < 150;
 }
  public static void main(String[] args){
     System.out.println("Valid Name: " +Validate("pa$l"));
     System.out.println("Valid Age: " +Validate(89));
 }
}