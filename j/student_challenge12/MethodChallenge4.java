//find the greatest common divisor between two numbers
class MethodChallenge4{
 static int gcd(int n1, int n2){
   while(n1!=n2){
    if(n1>n2) {
     n1 -= n2;
  }else{
    n2 -= n1;
  }
  }
   return n1;   //return m or n
 }
  public static void main(String[] args){
   int d = gcd(25, 15);
   System.out.println("The Greatest Common Divisor is: " +d);
 }
}