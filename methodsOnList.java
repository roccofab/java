import java.util.ArrayList;
import java.util.Scanner;

public class methodsOnList {
     static ArrayList<String> enterStrings() {
        ArrayList<String> strList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter string(stop to end): ");
        while (true) {
            String input = scanner.nextLine();

            if(input.equals("stop")) {
                break;
            }
            strList.add(input);
        }
        return strList;
     }
     static ArrayList<Integer> enterInteger() {
        ArrayList<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nenter integer number(0 to stop): ");
        while(true) {
            int number = scanner.nextInt();

            if(number == 0) {
                break;
            }
            integerList.add(number);
        }
        return integerList;
     }

     static void printList(ArrayList<String> list) {
        for(String i : list) {
            System.out.print(i+ ",");
        }
     }
     static void printIntegerList(ArrayList<Integer> numsList) {
        for(int c: numsList) {
            System.out.print(c+ ",");
        }
     }
     static int sum(ArrayList<Integer> listAddend) {
        int sum = 0;
        for(int l : listAddend) {
            sum += l;
        }
        return sum;
     }
     static ArrayList<String> unisciArrayListString(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    static ArrayList<Integer> unisciArrayListInteger(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //print list of strings from input user
         ArrayList<String> strList = enterStrings();
         printList(strList);

        

        //print list of integers from input user and then print the sum
        ArrayList<Integer> integerList = enterInteger();
        System.out.print("List of integers: ");
        printIntegerList(integerList);
        int totalSum = sum(integerList);
        System.out.println("\nSum of integers: " + totalSum);


        //duplication of the list of string
        ArrayList<String> mergedStringList = unisciArrayListString(strList, strList);
        System.out.print("Merged String List: ");
        printList(mergedStringList);
        
        //duplication of the integer list
        ArrayList<Integer> mergedIntegerList = unisciArrayListInteger(integerList, integerList);
        System.out.print("\nMerged Integer List: ");
        printIntegerList(mergedIntegerList);
    }
}