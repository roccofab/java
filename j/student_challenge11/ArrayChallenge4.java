//print the first maximum value and the second maximum value stored in an array
import java.util.*;
import java.util.Arrays;
class ArrayChallenge4{
  public static void main(String[] args){
  int[] nums = {-100, -2, -10, -15, 2, -1};
  int max1 = Integer.MIN_VALUE;
  int max2 = Integer.MIN_VALUE;
  for(int i = 0; i < nums.length; i++){
   if(nums[i] > max1){
     max2 = max1;
     max1 = nums[i];
   } else if(nums[i] > max2){
     max2 = nums[i];
   }
  }
System.out.println("The First Max Value is: " +max1);
  System.out.println("The Second Max Value is: " +max2);
 }
}