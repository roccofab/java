import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1;
        String str2;
        do {
         System.out.println("\nInserire stringa1: ");
        str1 = input.nextLine();
        
        System.out.println("\nInserire stringa2: ");
        str2 = input.nextLine();

        if(!str1.equals(str2)) {
            System.out.println("\n\n\tSTRINGHE DIVERSE!!");
        }

         } while(!str1.equals(str2)); 

        if(str1.equals(str2)) {
            System.out.println("\n\n\t" +str1+ " -- " +str2+ " || SONO UGUALI!\n");
        } 
        
    }
}