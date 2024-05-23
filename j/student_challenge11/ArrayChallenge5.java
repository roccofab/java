//reverse an array
import java.util.*;
import java.util.Arrays;
class ArrayChallenge5{
 public static void main(String[] args){
  int[] nums = {1,2,3,4,5,6,7,8,9,10};
  for(int i = nums.length - 1; i >= 0; i--){
   System.out.print(nums[i]);
   if(i > 0){
    System.out.print(",");
  }
 } 
}
}