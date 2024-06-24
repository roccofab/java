class Customer extends Thread{
 ATM atm;
 String name;
 int amount;

 Customer(String n, ATM a, int amt){
  name = n;
  atm = a;
  amount = amt;
 }
 public void useATM(){
  atm.checkBalance(name);
  atm.withdraw(name, amount);
 }
 public void run(){
  useATM();
 }
}