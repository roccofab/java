import java.util.Map;
import java.util.Scanner;
public class Menu extends DataAccount{
    private Map<Integer, DataAccount> accountTargets;  //accountTargets hashmap store existing accounts, the key is the numberAccount
    Scanner sc = new Scanner(System.in);
    public Menu(Map<Integer, DataAccount> accountTargets) {
        this.accountTargets = accountTargets;  //the hashmap is populated in the main method
    }
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
