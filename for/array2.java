import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        
        Collections.reverse(nums);
        int sum = 0;
        for(int c : nums) {
            sum += c;
            System.out.print(c+ " ");
        }
        System.out.println(sum);
    }
}