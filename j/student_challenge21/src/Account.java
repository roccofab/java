import java.util.Random;
class Account{
 private int numberAcc;
 private String owner;
 private String adress;
 private int phoneNo;
 protected long balance;

 public Account(int numberAcc, String owner, String adress, int phoneNo,long balance){  //constructor with 4 parameter
   this.numberAcc = numberAcc;
   this.owner = owner;
   this.adress = adress;
   this.phoneNo = phoneNo;
   this.balance = 0;
 }
 public Account(int numberAcc, String owner){  //constructor with two parameters
   this.numberAcc = numberAcc;
   this.owner = owner;
   adress = "unknown";
   phoneNo = -1;
   balance = 0;
 }
 public Account(String owner){  //constructor with only one parameter
   numberAcc = generateRandomNumberAcc();   //generate a random 6 digits number that represent the numberAcc
   this.owner = owner;
   adress = "unknown";
   phoneNo = -1;
   balance = 0;
 }
 public int getNumberAcc(){
   return numberAcc;
 } 
 public String getOwner(){
   return owner; 
 }
 public String getAdress(){
   return adress;
 }
 public int getPhoneNo(){
   return phoneNo;
 }
 public long getBalance(){
  return balance;
 }
 public void setAdress(String newAdress){
   this.adress = newAdress;
 }
 public void setPhoneNo(int newNum){
   this.phoneNo = newNum;
 }
// Generate a random numberAcc of 6 digits
 public int generateRandomNumberAcc() {
   Random rand = new Random();
   return 100000 + rand.nextInt(900000);
  }
 public String toString(){
  return "Owner: " +owner+ "\nNumber Account: " +numberAcc+ "\nPhone Number: " +phoneNo+ "\nCurrent Balance: " +balance; 
 }
}