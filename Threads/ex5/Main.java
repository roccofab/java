public class Main{
 public static void main(String[] args){
   ATM atm = new ATM();
   Customer c1 = new Customer("John",atm, 200);
   Customer c2 = new Customer("Bill", atm, 100);
   Customer c3 = new Customer("Andrew", atm, 350);
   c1.start();
   c2.start();
   c3.start();
 }
}