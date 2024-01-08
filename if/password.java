import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = input.nextLine();
        if (password.length()>= 8 && hasSimble(password)) {
            System.out.println("Safe Password!");
        } else {
            System.out.println("Not safe");
        }
        // This function checks if the password has special symbols
    private static boolean hasSymble(String str) {
        String specialSymbols = "!@#$%^&*()_-+=<>?/{}[]|";
        for (char character : str.toCharArray()) {
            if (specialSymbols.indexOf(character) != -1) {
                return true;
            }
        }
        return false;
    }
        }
}

    
