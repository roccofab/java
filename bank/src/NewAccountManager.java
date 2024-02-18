import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NewAccountManager {
    private String filename = "dataAccount.txt";

    public void createNewAccount(int newAccountNumber, String newUsername, String password) {
        try {
            bankBalance newAccount = new bankBalance(newAccountNumber, 0.0, newUsername);
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename, true))) {
                oos.writeObject(newAccount);
            }
            System.out.println("Nuovo account creato con successo.");
        } catch (IOException e) {
            e.printStackTrace();

            class NewManager {
                private String filename = "dataAccount.txt";

                public void createNewAccount(int newAccountNumber, String newUsername, String password) {
                    try {
                        bankBalance newAccount = new bankBalance(newAccountNumber, 0.0, newUsername);
                        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename, true))) {
                            oos.writeObject(newAccount);
                        }
                        System.out.println("Nuovo account creato con successo.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                public String getNewAccountInfo() {
                    return getNewAccountInfo().toString();
                }
            }

        }
    }

}
