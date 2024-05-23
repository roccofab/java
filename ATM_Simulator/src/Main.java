import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, DataAccount> targetsAccounts = new HashMap<Integer, DataAccount>();
        int AccountsToGenerate = 100;  //number of accounts to create
        int number = 100000000;
        for (int i = 0; i < AccountsToGenerate; i++) {
            DataAccount account = new DataAccount();
            account.accountNumber = number + i;
            targetsAccounts.put(account.accountNumber, account);
        }
        Menu menu = new Menu(targetsAccounts);
        menu.Login();
        menu.Actions();
    }
}