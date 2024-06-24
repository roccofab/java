
import java.util.Scanner;
import java.text.DecimalFormat;
public class DataAccount {
    private double balance;
    private int pinNumber;
    public int accountNumber;
    private String customer;

    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("'€' 0.00");

    public DataAccount() {
        pinNumber = 1234;
        balance = 0.0;
        accountNumber = 123456789;
        customer = "John Smith";
    }

    /**
     * calculate new balance withdraw
     *
     * @param amount
     * @return balance -= amount
     */
    public double BalanceWithdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0;
        } else {
            balance -= amount;
            return balance;
        }
    }

    /**
     * calculate new balance with deposit
     *
     * @param amount
     * @return balance += amount
     */
    public double BalanceDeposit(double amount) {
        balance += amount;
        return balance;
    }

    /**
     * make withdraw and then get the updated balance with Withdraw amount from input
     *
     * @throws RuntimeException
     */
    public void getBalanceWIthDraw() {
        System.out.println(df.format(balance));
        System.out.println("Enter amount to withdraw: ");
        double amount = sc.nextDouble( );
        BalanceWithdraw(amount);
        if (amount > balance) {
            throw new RuntimeException("Insufficient Founds");
        } else {
            System.out.println(df.format(balance));
        }
    }

    /**
     * make deposit and then get the updated balance with deposit amount from input
     *
     * @throws RuntimeException
     */
    public void getBalanceWithDeposit() {  //get the updated balance with deposit amount from input
        System.out.println(df.format(balance));
        System.out.println("Enter amount to deposit: ");
        double amount = sc.nextDouble( );
        BalanceDeposit(amount);
        if (balance + amount > 0) {
            System.out.println(df.format(balance));
        } else {
            throw new RuntimeException("Insufficient founds");
        }
    }
    /**
     * transfer amount to another account, target account is stored in a HashMap where the key is the accountNumber
     * @param amount amount to transfer
     * @param target is the object account target
     * @throws java.lang.RuntimeException
     */
    public void transferFound(DataAccount target, double amount){
        if(amount > balance){
            throw new RuntimeException( "Insufficient founds" );
        } else {
            balance -= amount;
            target.BalanceDeposit(amount);
            System.out.println(df.format(balance));
        }
    }

    /**
     * get the balance in the specified decimal format
     */
    public void getBalance(){
        System.out.println(df.format(balance));
    }
}
