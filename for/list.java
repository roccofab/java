import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> nums = new ArrayList<>();
           nums.add(11.0);
           nums.add(21.3);
           nums.addAll(Arrays.asList(21.0, 53.3, 20.0, 100.0, 22.0, 231.0));
           double sum = 0;
           double average = 0;
           for(double l: nums) {
              sum += l;
            System.out.print(l+ ",");
           }
           average = sum / nums.size();
           System.out.println("\n" +sum);
           System.out.println("The average is: " +average);
    }
}