//insert number into an array
import java.util.*;
import java.util.Arrays;
class ArrayChallenge7{
 public static void main(String[] args){
 int[] nums = new int[10];
 nums[0] = 2; nums[1] = -1; nums[2] = 10; nums[3] = 4; nums[4] = 20; nums[5] = 3; nums[6] = 5;
 int n = 6;
 for(int i = 0; i < n; i++){
  System.out.print(nums[i] + " ");
 }
 int element = 100;
 int index = 2;
 for(int i = n; i > index; i--){
   nums[i] = nums[i-1];
  }
  nums[index] = element;

  System.out.println();
  for(int i = 0; i < n; i++){
  System.out.print(nums[i] + " ");
  }
 }
}