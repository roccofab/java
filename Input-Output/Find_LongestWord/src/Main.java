import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//program to find the longest word in a text file
public class Main {
    public static String findLongestWord(File file){
        String longest = "";
        String current;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                current = scanner.next();
                if (current.length() > longest.length()) {
                    longest = current;
                }
            }
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return longest;
    }
    public static void main(String[] args) {
        File file = new File("File_to_Read.txt");
        System.out.println(findLongestWord(file));
    }
}