class ATM{
 synchronized public void checkBalance(String name){
  System.out.print(name+ " CHECKING");
  try{Thread.sleep(2000);} catch(Exception e){}
   System.out.println("BALANCE");
 }
 synchronized public void withdraw(String name, int amount){
  System.out.print(name+ " WITHDRAW ");
  try{Thread.sleep(2000);} catch(Exception e){}
   System.out.println(amount);
 }
}