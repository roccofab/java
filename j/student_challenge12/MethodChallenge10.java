//sum of all elements using varargs
import java.util.*;
class MethodChallenge10{
 static int Sum(int...x){
  int sum = 0;
  for(int i : x){
    sum += i;
  }
  return sum;
 }
 static double Sum(double...x){
  double sum = 0;
  for(double i : x){
    sum += i;
  }
  return sum;
 }
 public static void main(String[] args){
  System.out.println("Sum is: " +Sum(10, 20, 20));
  System.out.println("Sum is: " +Sum(10.5, 20.5, 50.55, -110.25));
 }
}