import java.util.Scanner;
public class bubbleSort {
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
    public static int[] arrayToSort(int[] array) {
        int[] sortedArray = array.clone();
        for(int i = sortedArray.length-1; i>=1;i-- ) {
          for(int j=0; j<i; j++) {
            if(sortedArray[j] > sortedArray[j+1]) {
                int value = sortedArray[j];
                sortedArray[j] = sortedArray[j+1];
                sortedArray[j+1] = value;
            }
          }
        }
        return sortedArray;
    }
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array length: ");
        int arrayLength = input.nextInt();
        int[] generatedArray = generateArray(arrayLength);
        for(int numbers : generatedArray) {
            System.out.print(numbers);
        }
        int[] arraySort = arrayToSort(generatedArray);
        System.out.println("The SORTED array is: ");
        for(int numbers1 : arraySort) {
            System.out.print(+numbers1);
        }

}
}