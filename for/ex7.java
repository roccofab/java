import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] words = {"home", "array","home", "array", "book", "java", "book" , "school", "arrray", "java", "school", "home", "java" };
        System.out.println("Enter word and let's see if it's stored in the database: ");
        String entered = input.nextLine();
        int counter = 0;
        for( String findWord : words) {
           if(findWord.equals(entered)) {
                counter++;
            } 
        }
            System.out.println(entered+ " is repeated: " +counter+ " times ");
    }
}