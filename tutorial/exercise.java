import java.util.Scanner;
public class exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String [] word = {"hello", "programming", "code", "java", "code", "programming", "java", "code", "java", "java"};
       for(String i : word) {
        System.out.print(i+ ",");
       }
       System.out.println("enter word: ");
       String choice = input.nextLine();
       int c = 0;
       for(String l : word) {
        
        if(l.equals(choice)) {
            c++;
        }
       
       }
        System.out.println("The entered word is stored " +c+ " times!");
    }
}