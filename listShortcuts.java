import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class listShortcuts {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(5);
        list1.add(15);
        list1.add(25);
        list1.add(-4);
        list1.add(100);
        list1.add(50);
        list1.add(300);
        list1.add(85);
        
        //printing list using for each 
        for(int i : list1) {
            System.out.print(i+ ",");
        }
        
        System.out.println();
        //shortcut 1 to print list
        Arrays.asList(list1);
        list1.forEach(System.out::println);
        
        
        //shortcut2 to print list
        System.out.println();
        list1.stream().forEach(System.out::println);
        
        //shortcut to print the maximum value in the list 
        int maxValue = list1.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
        System.out.println("\n\nThe max value is: " +maxValue);
        
        
        //shortcut to print the minimum value in the list
        int minValue = list1.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
        System.out.println("The min value is: " +minValue);
        
        
        //shortcut to get position element from input user
        System.out.println("\n\nEnter number stored in the list: ");
        int inputUser = input.nextInt();
        int index = list1.indexOf(inputUser);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element position index: " +index);
        }
        
        
        //shortcut to sort list1 in ascending order
        list1.sort(null);
        System.out.println("\nSorted list: " +list1);

        //shortcut to sort list 1 in descending order
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("List sorted in descending order: " +list1);
    }
}
