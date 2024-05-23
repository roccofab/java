//calculate discount using varargs
import java.util.*;
class MethodChallenge11{
 static double Discount(double...prices){
  int sum = 0;
  for(double i : prices){
   sum += i;
  }
  double discount = sum * 0.10;
  sum -= discount;
  return sum;
 }
 public static void main(String[] args){
  System.out.println("The Total Discounted Price is: " +Discount(50.0,50.0));
 }
}