public class Main{
 public static void main(String[] args){
    SavingsAccount sAcc = new SavingsAccount(123456, "Logan franklin", "Bridge tower 34", 0, 0);
    sAcc.deposit(40000);
    System.out.println(sAcc.toString());
  }
}