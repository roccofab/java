
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

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
     static int evenOddNums(ArrayList<Integer> evenOddList) {
        int even=0;
        int odd=0;
        for(int l : evenOddList) {
            if(l % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("\nEven: " +even);
        System.out.println("Odd: " +odd);
        return even + odd;
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
    private static int containA(ArrayList<String> listToDetect, String letter) {
        int counter = 0;
        for(String s : listToDetect) {
            if(s.contains(letter)) {
                counter++;
            }
        }
        System.out.println("\n" +counter+ "strings contain letter A");
        return counter;
    }

    private static void sortListAscending(ArrayList<Integer> listToSort) {
        Collections.sort(listToSort);
    }
    private static void sortListDescending(ArrayList<Integer> listToSort) {
        Collections.sort(listToSort, Collections.reverseOrder());
    }

    private static int firstElement(ArrayList<Integer> list4){
        return list4.get(0);
    }
    private static int lastElement(ArrayList<Integer> list4) {
        return list4.get(list4.size() - 1);
    }
    private static int findElement(ArrayList<Integer> list5, int position) {
        return list5.get(position);
    }
    private static int modifyValue(ArrayList<Integer> list6, int positionElement, int newValue) {
        return list6.set(positionElement, newValue);
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

 
        /*generating and printing an arraylist of integers numbers and then detect the even
         and odd numbers*/ 
        ArrayList<Integer> evenOdd = enterInteger();
        System.out.println("List of integers: ");
        printIntegerList(evenOdd);
        int count = evenOddNums(evenOdd);


        
        /*generating and printing an arraylist of string and then detect
         how many strings contain letter A*/ 
        ArrayList<String> listToDetect = enterStrings();
        System.out.println("List of integers: ");
        printList(listToDetect);
        int countLetter = containA(listToDetect, "a");

        

        /*generating and printing an arraylist of integers numbers and then
         * print the same list in ascending order and descending order
         */
        ArrayList<Integer> listToSort = enterInteger();
        System.out.println("List of integers: ");
        printIntegerList(listToSort);
        sortListAscending(listToSort);
        sortListDescending(listToSort);
        System.out.print("\n List sorted in ascending order: " +listToSort);
        System.out.println("\n List sorted in descending order: " +listToSort);


        /*generating and printing a list of integers and then printing the first element
         * of the list
        */
        ArrayList<Integer> listtoDetect = enterInteger();
        System.out.println("List of integers: ");
        printIntegerList(listtoDetect);
        int elementFound = firstElement(listtoDetect);
        System.out.println("\n The first element of the list is: " +elementFound);
        
        //printing the last element of the list
        int elementLast = lastElement(listtoDetect);
        System.out.println("\nThe la st element of the list is: " +elementLast);

        

        //find the element from input user index position
        System.out.println("\nEnter index of the element you want to find: ");
        int elementPosition = input.nextInt();
        int positionValue = findElement(listtoDetect, elementPosition);
        System.out.println("\nThe element in position " +elementPosition+ " is : " +positionValue);

       
        
        /*Generating and printing a list of integers numbers and then enter 
         * the index and value of the element you need to modify and printing the new list
         */
        ArrayList<Integer> listToModify= enterInteger();
        System.out.println("List of integers: ");
        printIntegerList(listToModify);
        System.out.println("\nEnter index of the element to modify: ");
        int indexToModify = input.nextInt();
        System.out.println("Enter the new integer number: ");
        int newElement = input.nextInt();
        int newList = modifyValue(listToModify, indexToModify, newElement);
        System.out.print("\nThe new list is: " +newList);

    }
}
