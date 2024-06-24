import java.util.Map;
import java.util.Scanner;
/**
 * The Menu class provides a user interface for interacting with a bank's ATM system.
 * It allows users to log in, withdraw and deposit funds, check their balance,
 * and transfer funds to other accounts.
 * <p>
 * This class extends DataAccount and uses a Map to store and manage account data.
 * </p>
 */
public class Menu extends DataAccount{
    private Map<Integer, DataAccount> accountTargets;  //accountTargets hashmap store existing accounts, the key is the numberAccount
    Scanner sc = new Scanner(System.in);

    /**
     *
     * @param accountTargets a Map of existing accounts where the key is the account number
     */
    public Menu(Map<Integer, DataAccount> accountTargets) {
        this.accountTargets = accountTargets;  //the hashmap is populated in the main method
    }

    /**
     * Prompts the user to log in by entering a PIN.
     * <p>
     * The user has 3 attempts to enter the correct PIN. If the correct PIN is entered,
     * the user is logged in and can proceed to perform actions. If the PIN is incorrect
     * after 3 attempts, access is denied and the program exits.
     * </p>
     */
    public void Login(){
        System.out.println("Welcome to the ATM");
        int count = 0;
        boolean loggedIn = false;
        do {   //method to check the correct pin
            System.out.println("Please enter your pin: ");
            int pin = sc.nextInt();
            if (pin == 1234) {
                loggedIn = true;
                getBalance();
            } else {
                System.out.println("Wrong pin you have " +(3-count)+ " Attemps");
                count++;
            }
        } while(!loggedIn);
        if(!loggedIn) {   //exit from the program if you make more than 3 attemps
            System.out.println("Access Denied");
            System.exit(0);
        }
    }
    /**
     * Displays a menu of actions the user can perform and executes the selected action.
     * <p>
     * The user can choose to withdraw funds, deposit funds, check their balance, transfer funds,
     * or exit the application.
     * </p>
     */
    public void Actions() {
        int choice;
        do{
            System.out.println("1. Withdraw: ");
            System.out.println("2. Deposit: ");
            System.out.println("3. Check Balance: ");
            System.out.println("4. Transfer: ");
            System.out.println("5. Exit: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    getBalanceWIthDraw();
                    break;

                case 2:
                    getBalanceWithDeposit();
                    break;

                case 3:
                    getBalance();
                    break;

                case 4:
                    Transfer();
                    break;

                case 5:
                    System.exit(0);
                    break;
            }
        } while(true);
    }
    /**
     * Transfers a specified amount of money to a target account.
     * <p>
     * The method prompts the user to enter the account number of the target account and the amount to transfer.
     * It then performs the transfer if the target account exists, otherwise it notifies the user that the account
     * does not exist.
     * </p>
     */
    public void Transfer(){  //this method transfer amount to a targetAccount, all the targetsAccount are added to the HashMap in the main method
        System.out.println("Enter the number of the account you want to transfer to: ");
        int numberAccount = sc.nextInt();
        System.out.println("Enter Amount to Transfer: ");
        double amount = sc.nextDouble();
        DataAccount targetAccount = accountTargets.get(numberAccount);  //search for the targetAccount using the numberAccount
        if(targetAccount == null){
            System.out.println("Account does not exist");
        } else{
            transferFound(targetAccount, amount);
        }
    }
}
