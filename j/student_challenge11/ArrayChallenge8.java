//delete number from an array
import java.util.*;
import java.util.Arrays;
class ArrayChallenge8{
 public static void main(String[] args){
   int[] nums = {1,3, 5, 7, 9, 12, 15};
   int indexToRemove= 3;
   int[] newNums = new int[6];
   for(int i = 0;i < indexToRemove; i++){
    newNums[i] = nums[i];
  }
   for(int i = indexToRemove; i < nums.length-1; i++){
    newNums[i] = nums[i+1];
  }
  for(int i = 0; i < newNums.length; i++){
    System.out.print(newNums[i]+ " ");
  }
 }
}