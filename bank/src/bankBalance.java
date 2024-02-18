import java.io.*;

class bankBalance implements Serializable {
    private int numberAccount;
    private double balance;
    private String user;

    public bankBalance(int numberAccount, double balance, String user) {
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.user = user;
    }
    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return user;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }
        public void setUsername(String user) {
            this.user = user;
        }

        public void setBalance(double balance) {
         this.balance = balance;
        }


        @Override
    public String toString() {
            return "Account: \n" +
                    "Number Account: " + numberAccount + "\n" +
                    "Balance: " + balance + "€\n" +
                    "Username: " + user + "\n";
        }
}

