import java.util.Scanner;
import java.util.Random;
public class insertionSort {
    public static void insertion_sort(int[] array) {     //method to sort array by insertion sort
        for (int i = 1; i < array.length; i++) {  // iteration begin from index 1
          int key = array[i];        
      
          int j = i - 1;       //iteration begin from index 0
          while (j >= 0 && array[j] > key) {    //compares the elements at index i with the elements at index j
            array[j + 1] = array[j];
            j--;
          }
      
          array[j + 1] = key;    //enter the element in the correct position
        }
      }

      public static int [] generateRandomArray(int index) {   //method to generate random array that contain integers from 0 to 100
        int[] randomArray = new int[index];
        Random rand = new Random();
        for(int i = 0; i < index; i++) {
            randomArray[i] = rand.nextInt(100);
        }
        return randomArray;
      }

      public static void printArray(int [] arrayToPrint) {   //method to print an array
        for( int l = 0; l < arrayToPrint.length; l++) {
            System.out.print(arrayToPrint[l]+ " ");
        }
    }
      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int indexArray = 10;
       int [] array = generateRandomArray(indexArray);
      
       System.out.println("original array(not sorted):\n");
       printArray(array);
       
       System.out.println("\nSorted array:"); 
       insertion_sort(array);
       printArray(array);
    }
}