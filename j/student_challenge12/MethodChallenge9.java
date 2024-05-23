//maximum number using variable arguments
import java.util.*;
import java.util.Arrays;

class MethodChallenge9{
 static int Max(int...nums){
  int max = Integer.MIN_VALUE;
  if(nums.length == 0) return Integer.MIN_VALUE;
  for(int i : nums){
    if(i > max) {
     max = i;
   }
  }
   return max;
 }

static void show(int...nums){
  for(int i : nums) {
    System.out.print(nums+ " ");
  }
}
 public static void main(String[] args){
  System.out.println("The Max Value is: " +Max());
  System.out.println("\nThe Max Value is: " +Max(-100, 100));
  System.out.println("The Max Value is: " +Max(1,-10,20,40,50,300,200));
 }
}