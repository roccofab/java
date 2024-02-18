import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static <NewAccountManager, NewAccountManager> void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Create new Bank Account(press +), login(press -): ");
        String input = scan.nextLine();
        switch(input) {
            case "+":
                int randomAccountNumber = (int) (Math.random() * 1000000000);
                System.out.println("Enter Username: ");
                String username1 = scan.nextLine();
                System.out.println("Enter Password: ");
                String password1 = scan.nextLine();
               NewAccountManager newAccount = new NewAccountManager();
               newAccount.createNewAccount(randomAccountNumber, username1, password1);
                System.out.println(newAccount.NewAccountInfo());
                accountManager newManagement = new accountManager();
                boolean loginNew = newManagement.login(username1, password1);
                if(loginNew) {
                    System.out.println("Login Successfull!");
                    System.out.println(newManagement.getAccountInfo());
                    System.out.println("Insert money(yes or not)? ");
                    String input2 = scan.nextLine();
                    if(input2.equals("yes")) {
                        newManagement.insertMoney();
                    } else {
                        System.out.println("Cancelled!");
                    }
                }
                break;

            case "-":
                System.out.println("Enter Username: ");
        String username = scan.nextLine();

        System.out.println("Enter password: ");
        String password = scan.nextLine();

        accountManager management = new accountManager();
        boolean login = management.login(username, password);
        if(login) {
            System.out.println("Login Successfull!");
            System.out.println(management.getAccountInfo());

            management.insertMoney();
        }
        break;
        }

        scan.close();
    }
}