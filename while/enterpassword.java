import java.util.Scanner;

public class enterpassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "hello2wrld=D";
        int attempts = 0;
        boolean logIn = false;

        while (attempts < 3 && !logIn) {
            System.out.println("Password: ");
            String enteredPassword = input.nextLine();

            if (enteredPassword.equals(password)) {
                System.out.println("Correct");
                logIn = true; // Imposta loggedIn su true per uscire dal loop
            } else {
                System.out.println("Wrong");
                attempts++;
            }
        }

        if (logIn) {
            System.out.println("Access confirmed!");
        } else {
            System.out.println("Access denied...");
        }
    }
}
