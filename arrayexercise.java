import java.util.Scanner;
public class arrayexercise {
    public static int counter(int element, int [] array) {   //method to count the occurences of an input user
        int occurences = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) {
                occurences++;
            }
        }
        return occurences;
    }
    
    public static boolean isAscendingOrder(int [] array2) {  //check if the array is sorted in ascending order
        for(int j = 0; j < array2.length - 1; j++) {
            if(array2[j] > array2[j + 1]) {
                return false;
            }
        } 
        return true;
    }

    public static void printArray(int [] arrayToPrint) {   //method to print an array
        for( int l = 0; l < arrayToPrint.length; l++) {
            System.out.print(arrayToPrint[l]+ " ");
        }
    }

    public static int[] reverseArray(int[] array3) {    //method to generate reverse array
        int start = 0;
        int end = array3.length - 1;

        while(start < end) {
            int temp = array3[start];
            array3[end] = array3[start];
            array3[end] = temp;

            start++;
            end--;
        }
        return array3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //printing array
        int [] array ={10, 1, 20, 40, 50, 70, 30, 1, 60, 12, 7, 7, 7, 1, 1, 20, 20, 50, 50, 50, 70, 70, 30};
         printArray(array);
        
        
         //counting number of occurences
        System.out.println("\n enter integer number: ");
        int element = input.nextInt();

        int occurences = counter(element, array);
        System.out.println("Occurences of the entered element: " +occurences);


        
        //checking if the array is sorted in ascending order
       if(isAscendingOrder(array)) {
        System.out.println("The array is sorted in ascending order");
       }
       else {
        System.out.println("The array is not sorted in ascending order");
       }

    
       //printing the original array and reverse array
       int[] array3 = reverseArray(array.clone());  // clone array to avoid modifying the original array
        System.out.println("\nReversed array:");
        printArray(array3);
    }
}