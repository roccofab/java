import java.io.*;
import java.util.Scanner;

public class accountManager {
    private bankBalance BankBalance;
    private String filename = "dataAccount.txt";
    private int newAccountNumber;
    private String newUsername;
    private String password;
    private String username;

    private boolean fileExists() {
        File file = new File(filename);
        return file.exists();
    }
    public accountManager() throws IOException {
        if (!fileExists()) {
            this.BankBalance = new bankBalance(0, 0.0, "admin");
            saveBankBalance();
        } else {

            this.BankBalance = loadBankBalance();
        }
    }


    public class accountManager1 {
        private bankBalance BankBalance;
        private String filename = "dataAccount.txt";
        private int newAccountNumber;
        private String newUsername;
        private String password;

        private boolean fileExists() {
            File file = new File(filename);
            return file.exists();
        }
        public accountManager1(int newAccountNumber) throws IOException {
            this.newAccountNumber = newAccountNumber;
            if (!fileExists()) {
                this.BankBalance = new bankBalance(0, 0.0, "admin");
                saveBankBalance();
            } else {

                this.BankBalance = loadBankBalance();
            }
        }


        private bankBalance  loadBankBalance() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
                return (bankBalance) ois.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("File not Found. Create new Account.");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return new bankBalance(0, 0.0, "");

        }

        private void saveBankBalance() {
            //save login information in filename("dataAccount.txt")
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
                oos.writeObject(BankBalance);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public String getAccountInfo() {
            return BankBalance.toString();
        }

        public void insertMoney() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Inserisci l'importo da depositare: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consuma il newline rimasto nel buffer

            System.out.print("Inserisci il numero dell'account: ");
            int accountNumber = scanner.nextInt();
            scanner.nextLine();

            BankBalance.setBalance(BankBalance.getBalance() + amount);
            BankBalance.setNumberAccount(accountNumber);

            saveBankBalance();

            System.out.println("Importo depositato con successo.");
            System.out.println(getAccountInfo());

            scanner.close();
        }
    }
    public boolean login(String username, String password) {
        if("admin".equals(username) && "password123".equals(password)) {
            return true;
        } else {
            return false;
        }
    }


    private bankBalance  loadBankBalance() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (bankBalance) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found. Create new Account.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new bankBalance(0, 0.0, "");

    }

    private void saveBankBalance() {
       //save login information in filename("dataAccount.txt")
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(BankBalance);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAccountInfo() {
        return BankBalance.toString();
    }

    public void insertMoney() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci l'importo da depositare: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consuma il newline rimasto nel buffer

        System.out.print("Inserisci il numero dell'account: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        BankBalance.setBalance(BankBalance.getBalance() + amount);
        BankBalance.setNumberAccount(accountNumber);

        saveBankBalance();

        System.out.println("Importo depositato con successo.");
        System.out.println(getAccountInfo());

        scanner.close();
    }
}
