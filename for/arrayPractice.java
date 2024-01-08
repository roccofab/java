import java.util.Arrays;
import java.util.Scanner;
public class arrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int [] nums = {1,2,3,4,5,10,20,-10,3,4,7,9,1,2,2,2,1,1};
       int [] nums2 = {1,20,30,40,-10,-200,-100,20,20,10,-2,-3,40,40,40,1,20,20};
       int [] nums3 = new int[nums.length];
       int maxNums= nums[0];
       int maxNums2=nums2[0];
       int minNums = nums[0];
       int minNums2 = nums2[0];
       
       int deleteNums = 2;
       int deletenums2 = 20;
       int deleteNums3 = 2; 
       int maxNum = nums[0];
       for(int i=0; i< nums.length; i++) {
        nums3 [i] = nums[i] + nums2[i];

        if(nums[i] < nums[0]) {
            minNums = nums[i];
        }
        if(nums[i] > nums[0]) {
            maxNums = nums[i];
        }
        if(nums[i] == deleteNums) {
            
        }
        System.out.print(nums[i]+ ",");
       }
       System.out.println("\nThe minimum number is: " +minNums);
       System.out.println("The maximum number is: " +maxNums);
       System.out.println("The sum is: " +Arrays.toString(nums3));

       for(int j = 0; j<nums2.length;j++) {
        if(nums2[j] < minNums2) {
            minNums2 = nums2[j];
        }
        if(nums2[j] > maxNums2) {
            maxNums2= nums2[j];
        }
        System.out.print(+nums2[j]+ ",");
       }
       System.out.println("\nThe minimum number is: " +minNums2);
       System.out.println("The maximum number is: " +maxNums2);
    }
}