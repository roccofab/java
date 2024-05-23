/*Given an integer array nums and an integer val, remove all occurrences of val in nums
 in-place. The order of the elements may be changed.
  Then return the number of elements in nums which are not equal to val.
  Example: Input: nums = [3,2,2,3], val = 3
           Output: 2, nums = [2,2,_,_]
 */
import java.util.Arrays;
public class Main {
    public static int RemoveElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        for(int i = index; i < nums.length; i++) {
            nums[i] = val;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(RemoveElement(nums, val) + ", nums = " + Arrays.toString(nums));
    }
}