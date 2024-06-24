import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
//program that reads a list of numbers from a file and throws an exception if any of the numbers are positive

public class Main {
    public static void readLines(File file) throws PositiveNumberException, IOException, FileNotFoundException {
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();  //read line
                String[] numbers = line.split("\\s+"); //Splits the line into numbers separated by spaces
                for (String number : numbers) {
                    try {
                        int num = Integer.parseInt(number);
                        if (num > 0) {
                            throw new PositiveNumberException( );
                        }
                    } catch(PositiveNumberException e){
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println(line);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("nums.txt");
        try {
            readLines(file);
        } catch (PositiveNumberException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}