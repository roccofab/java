import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class array1d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int somma = 0;
        int [] store = {20, 50, 1, 5, 10, 35, 40, 50, 120, 300, 50};
        
        int max = store[0];
        int min = store [0];
        
        double average = 0;
        
        boolean isEqualTo50 = false;     //we use this variable to check if there is "50" in the array store
        boolean isOver100 = false;       //we use this variable to check if there are numbers over 100 in the array store
        int i100 = 0;        //counter of elements >= 100
        int i50 = 0;         //counter of elements equal to 50
        
        for(int l : store) {          //printing store[] content
            System.out.print(l+ "\n");
            int counter = l;
            somma += counter;
            if(counter > max) {      //check the maximum value stored in  store[]
                max = counter;
            }
            if(counter < min) {      //check the minimum value stored in  store[]
                min = counter;
            }
            
            if(counter >= 100) {     //check how many numbers over 100 are stored in store[]
                isOver100 = true;
                i100++;
            }
            
            if(counter == 50) {     //check how many numbers == 50 are stored in store[]
                isEqualTo50 = true;
                i50++;
            }
        }
        System.out.println("\nThe sum of the elements is: " +somma);    //printing the sum of the elements stored in store[]
        System.out.println("\nmax value is: " +max);
        System.out.println("\nmin value is: " +min);
        average = somma/ store.length;            //average is the division between the sum and the number of elements
        
        System.out.println("\nThe average is: " +average);  //printing average
        
        if(isOver100) {
            System.out.println("\nAre stored: " +i100+ " elements >= 100");
        }
        if(isEqualTo50) {
            System.out.println("\nAre stored: " +i50+ " elements equals to 50\n");
        }
        
        //enter a number contained in the array[store] to its index 
        System.out.println("\nEnter a number stored in the array to find its index: ");
        int findIndex = input.nextInt();
        int foundIndex = -1;    //no number has -1 for index
        
        for(int i = 0; i < store.length; i++) {
            if(store[i] == findIndex) {
                foundIndex = i;
                break;
            }
        }
        if(foundIndex != -1) {
            System.out.println("\nThe corresponding index for the number " +findIndex+ " is: " +foundIndex+ "\n");
        } else {
            System.out.println("\n" +findIndex+ " isn't stored in the array...\n");
        }
        
        //Convert the order of the elements in the array store []
        System.out.println("Let's print the inverted content of the array:\n");
        for(int i = store.length - 1; i >= 0; i--) {
            System.out.println(store[i]);
        }
        
       
        //delete the number "50" from store[] and so i generate a new array
        int count = 0;
        int elementToRemove = 50;
        int [] newStore = null;
        
        System.out.println("Let's print the original array and the array without number 50:");
        for(int s : store) {
            if(s == elementToRemove) {
                count++;
            }
        }
        if(count > 0) {
            newStore = new int[store.length - count];
            int newIndex = 0;
            
            for(int f : store) {
                if(f != elementToRemove ) {
                    newStore[newIndex] = f;
                    newIndex++;
                }
            }
            System.out.print("\n\tThis is the original array: " +Arrays.toString(store)+ "\n");
            System.out.println("\n\tThis is the array without integer 50: " +Arrays.toString(newStore)+ "\n");
        }  else {
            System.out.println("\n\tThe entered element isn't stored in the array store[]");
        }

        //How to link two array
        String [] array1 = {" hello " , " programming ",  " java language ",  " array "};
        String [] array2 = {" bubble sort ",  " javascript ",  " html ",  " css "};
        int length = array1.length + array2.length;
        String [] newArray = new String[length];
        System.out.println("\nLet's link two string arrays:");
        for(int x = 0; x < array1.length; x++) {
            System.out.print( array1[x]+ "\n");
            newArray[x] = array1[x];
        }
        for(int x = 0; x < array2.length; x++) {
            System.out.print( "\n" +array2[x]);
            newArray[array1.length + x] = array2[x];
        }
        for(String element : newArray) {
            System.out.print("\n\t" +element+ " ");
        }
    }           
}
