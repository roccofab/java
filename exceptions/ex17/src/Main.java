import java.util.Scanner;
public class Main {
    public static boolean hasVowels(String str) throws HasNoVowelsException{
            if (!str.matches(".*[aeiouAEIOU].*")) {
                throw new HasNoVowelsException("String has no vowels");
            }
            return str.matches(".*[aeiouAEIOU].*");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter String(exit to stop): ");
            String str = sc.nextLine();
            if(str.equalsIgnoreCase("exit"))
                break;
            try {
                System.out.println(hasVowels(str));
            } catch (HasNoVowelsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}