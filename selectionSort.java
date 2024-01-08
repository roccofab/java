import java.util.Scanner;
public class selectionSort {
    public static int[] generateArray(int lengthArray) {
         Scanner scanner = new Scanner(System.in);
         int [] arrayToGenerate = new int[lengthArray];
         System.out.println("Enter integers value: ");
         for(int i=0; i<lengthArray; i++) {
            System.out.print("enter: ");
            arrayToGenerate[i] = scanner.nextInt();
         }
         return arrayToGenerate;
    }
    public static int[] sortBySelection(int[] selectionArray) {
        for(int i =0; i<selectionArray.length; i++) {
            int minValue = i;

            for(int j = i+1; j<selectionArray.length; j++) {
                if(selectionArray[j] < selectionArray[minValue]) {
                    minValue = j;
                }
            }
            int value = selectionArray[i];
            selectionArray[i] = selectionArray[minValue];
            selectionArray[minValue] = value; 
        }
        return selectionArray;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array length: ");
        int arrayLEngth = input.nextInt();
        int[] arrayGenerated = generateArray(arrayLEngth);
        for(int l : arrayGenerated) {
            System.out.print(l);
        }

        //sort the generated array by selection
        System.out.println("\nArray sorted by selection:");
        sortBySelection(arrayGenerated);
        for(int p : arrayGenerated){
            System.out.print(p);
        }
    }
}