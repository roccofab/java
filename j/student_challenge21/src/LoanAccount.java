class LoanAccount extends Account{
 public LoanAccount(int numberAcc, String owner, String adress, int phoneNo,long balance){
  super(numberAcc, owner, adress, phoneNo, balance);
 }
 public void payLoan(long amount) {
   balance -= amount;
 }
 public void repay(int amount){
   if(balance == amount)
      balance = 0;
 }
}