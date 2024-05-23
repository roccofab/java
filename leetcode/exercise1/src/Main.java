//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] nums2 = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    nums2[0] = i;
                    nums2[1] = j;
                    return nums2;
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] nums2 = twoSum(nums, target);
        for(int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}