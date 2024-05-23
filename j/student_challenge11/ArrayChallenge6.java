//rotating an array to the left side
import java.util.*;
import java.util.Arrays;
class ArrayChallenge6{
 public static void main(String[] args){
  int[] nums = {1,2,3,4,5,6,7,8,9,10};
  for(int i : nums){
   System.out.print(i+ " ");
 }
 int temp = nums[0];
 for(int i = 1; i < nums.length; i++){
   nums[i-1] = nums[i];
 }
 nums[nums.length-1] = temp;
System.out.println();
 for(int i : nums){
   System.out.print(i+ " ");
 }
}
}