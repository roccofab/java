class SavingsAccount extends Account{
  public SavingsAccount(int numberAcc, String owner, String adress, int phoneNo,long balance){
   super(numberAcc, owner, adress, phoneNo, balance);
 }
 public void deposit(long amount) {
   balance += amount;
 }
 public void withDraw(long amount) {
   balance -= amount;
 }
}