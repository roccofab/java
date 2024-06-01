import arrayUtil.Array;
import arrayUtil.Array2;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array numbers = new Array(10);   //istanciate the object numbers from the class Array: the object is an array of random integers values
        Array2 numbers2 = new Array2(5, 5);  //istanciate the object numbers2 from the class Array2: the object is a matrix of random integers values
        numbers.printArray();
        System.out.println("\nSorted Array: " + numbers.sort());  //sort the original array numbers

        System.out.println("Sum: " + numbers.sum());   //calculate the sum of any numbers of array numbers

        System.out.println("Average: " + numbers.average());   //get average between numbers stored in array numbers

        System.out.println("Max number: " + numbers.max());   //get the maximum value from array numbers

        System.out.println("Min number: " + numbers.min());   //get the minimum value from array numbers

        System.out.println("Median Value: " + numbers.median());   //get the median value from array numbers

        System.out.println("Mode Value: " + numbers.mode());  //get the mode value from array numbers


        //get the index of a given number
        System.out.println("Enter Value stored in the Array: ");
        int element = sc.nextInt();
        int[] i = numbers.getIndex(element);
        System.out.println("Index: " + Arrays.toString(i));

        //count occurences of an input number
        System.out.println("Enter Value stored in the Array: ");
        int element2 = sc.nextInt();
        System.out.println("Occurences: " + numbers.getFrequency(element2));

        //print even numbers and their sum, print odd numbers and their sum
        System.out.println("Even Numbers: " + numbers.evenNumbers());
        System.out.println("Even Numbers Sum: " + numbers.sumEvenNumbers());
        System.out.println("Odd Numbers: " + numbers.oddNumbers());
        System.out.println("Odd Numbers Sum: " + numbers.sumOddNumbers());

        //calculate sum of elements into a range from input
        System.out.println("Sorted Array: " + numbers.sort());
        int start;
        int end;
        do {
            System.out.println("Enter Start Range(consider sorted array): ");
            start = sc.nextInt();
            System.out.println("Enter End Range(consider sorted array): ");
            end = sc.nextInt();
        } while (start < 0 || end < 0);
        System.out.println("Sum: " + numbers.sumRange(start, end));

        //print reverse array numbers
        int[] reversedArray = Array.reverse(numbers.V);
        System.out.print("Reversed Array: ");
        System.out.print("[");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.print("]");


        //check how many numbers stored in the array numbers are greater than an input number
        System.out.println("\nEnter Value: ");
        int element3 = sc.nextInt();
        System.out.println(numbers.isGreaterThan(element3) + " Numbers Are Greater than " + element3);
        System.out.println("\n");

        //print matrix of integers random values using the method printArray() from the class Array2
        System.out.println("\tMatrix:");
        numbers2.printArray();

        //sum of numbers stored in matrix numbers2 using the method sum from the class Array2
        System.out.println("Sum: " + numbers2.sum());

        //calculate average of numbers stored in matrix numbers2 using the method average from the class Array2
        System.out.println("Average: " + numbers2.average());

        //get maxim value stored in matrix numbers2 using the method max() from the class Array2: the method is based on two nested loops and comparation between values
        System.out.println("Max Value(using two nested loops): " + numbers2.max());

        //get maxim value stored in matrix numbers2 using the method maxStreamAPI from the class Array2:  the method make a stream of intStream type to matrix numbers2 and then get the maxim value with getAsInt from optionalInt
        System.out.println("Max Value(using stream API): " + numbers2.maxStreamApi());

        //search for an input number in matrix numbers2 using the method searchElement() from the class Array2
        System.out.println("\nEnter Value: ");
        int element4 = sc.nextInt();
        int[][] positions = numbers2.searchElement(element4);
        System.out.println("Element found at positions:");
        for (int[] pos : positions) {
            System.out.println("Row: " + pos[0] + ", Column: " + pos[1]);
        }

        //print original matrix numbers2 and then print transposed of it using the method transposedMatrix from the class Array2
        System.out.println("\n\tOriginal Matrix:");
        numbers2.printArray();
        System.out.println("\n\tTransposed Matrix:");
        int[][] transposed = numbers2.transposedMatrix();
        for (int l = 0; l < transposed.length; l++) {
            System.out.print("|");
            for (int j = 0; j < transposed[l].length; j++) {
                System.out.print(transposed[l][j] + " ");
                if (j < transposed[l].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("|");
        }

        //generate a new diagonal matrix diagonal diagonalM from the given matrix numbers2 using the method diagonalMatrix from the class Array2
        System.out.println("\n\tDiagonal Matrix:");
        int[][] diagonalM = numbers2.diagonalMatrix();
        for (int m = 0; m < diagonalM.length; m++) {
            System.out.print("|");
            for (int j = 0; j < diagonalM[m].length; j++) {
                System.out.print(diagonalM[m][j] + " ");
                if (j < diagonalM[m].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("|");
        }

        //multiply the given matrix numbers2 by a scalar using the method multiplyByScalar() from the class Array2
        System.out.println("Multiplication by scalar:");
        System.out.println("Enter Scalar: ");
        int element5 = sc.nextInt();
        int[][] multiplied = numbers2.multiplyByScalar(element5);
        for (int l = 0; l < multiplied.length; l++) {
            System.out.print("|");
            for (int j = 0; j < multiplied[l].length; j++) {
                System.out.print(multiplied[l][j] + "");
                if (j < multiplied[l].length) {
                    System.out.print(",");
                }
            }
            System.out.println("|");
        }


        //multiplication of the original matrix numbers2 by a new matrix numbers3 using the method multiplyMatrices from the class Array2
        System.out.println("\nMultiplication of the original matrix by new matrix:");
        System.out.println("Original Matrix:");
        numbers2.printArray();  //print original matrix numbers2
        System.out.println("New Matrix:");
        Array2 numbers3 = new Array2(5, 5);
        numbers3.printArray();   //print new matrix object numbers3 istanciated from the class Array2
        System.out.println("Multiplied Matrix:");
        int[][] multiplied2 = numbers2.multiplyMatrices(numbers2.M, numbers3.M);
        for (int j = 0; j < multiplied2.length; j++) {
            System.out.print("|");
            for (int l = 0; l < multiplied2[j].length; l++) {
                System.out.print(multiplied2[j][l] + "");
                if (l < multiplied2[j].length) {
                    System.out.print(",");
                }
            }
            System.out.println("|");
        }

        //addition of the original matrix numbers2 by a new matrix numbers3 using the method addMatrices from the class Array2
        System.out.println("\nAddition of two Matrices:");
        System.out.println("Original Matrix:");
        numbers2.printArray();
        System.out.println("New Matrix:");
        Array2 numbers4 = new Array2(5, 5);
        numbers4.printArray();  //print new matrix object numbers4 istanciated from the class Array2
        System.out.println("Added Matrix:");
        int[][] addedM = numbers2.addMatrices(numbers2.M, numbers4.M);
        for (int j = 0; j < addedM.length; j++) {
            System.out.print("|");
            for (int l = 0; l < addedM[j].length; l++) {
                System.out.print(addedM[j][l]);
                if (l < addedM[j].length) {
                    System.out.print(",");
                }
            }
            System.out.println("|");
        }
    }
}
