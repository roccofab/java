
import java.util.Scanner;
import java.text.DecimalFormat;
public class DataAccount {
    private double balance;
    private int pinNumber;
    public int accountNumber;
    private String customer;

    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("'€' 0.00");

    public DataAccount(){
        pinNumber = 1234;
        balance = 0.0;
        accountNumber = 123456789;
        customer = "John Smith";
    }
    public double BalanceWithdraw(double amount){  //calculate new balance withdraw
        if(amount > balance){
            System.out.println("Insufficient funds");
            return 0;
        }
        else{
            balance -= amount;
            return balance;
        }
    }
    public double BalanceDeposit(double amount){  //calculate new balance with deposit
        balance += amount;
        return balance;
    }
    public void getBalanceWIthDraw(){  //get the updated balance with Withdraw amount from input
        System.out.println(df.format(balance));
        System.out.println("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        BalanceWithdraw(amount);
        if(amount > balance){
            System.out.println("Insufficient funds");
        } else {
            System.out.println(df.format(balance));
        }
    }
    public void getBalanceWithDeposit(){  //get the updated balance with deposit amount from input
        System.out.println(df.format(balance));
        System.out.println("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        BalanceDeposit(amount);
        if(balance + amount > 0){
            System.out.println(df.format(balance));
        } else{
            System.out.println("Insufficient funds");
        }
    }
    public void transferFound(DataAccount target, double amount){  //transfer amount to another account, target account is stored in a HashMap where the key is the accountNumber
        if(amount > balance){
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            target.BalanceDeposit(amount);
            System.out.println(df.format(balance));
        }
    }
    public void getBalance(){
        System.out.println(df.format(balance));
    }
}
