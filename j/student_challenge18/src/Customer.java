class Customer{
  int custId;
  String name;
  String adress;
  String phoneNum;

  public Customer(int custId, String name, String adress, String phoneNum){
   this.custId = custId;
   this.name = name;
   this.adress = adress;
   this.phoneNum = phoneNum;
 }
  public Customer(int custId, String name){
   this.custId = custId;
   this.name = name;
   adress = "unknown";
   phoneNum = "unknown";
 }
 public Customer(){
  custId = 0;
  name = "unknown";
  adress = "unknown";
  phoneNum = "unknown";
 }
 public int getCustId(){
  return custId;
 }
 public String getName(){
  return name;
 }
 public String getAdress(){
  return adress;
 }
 public String getPhoneNum(){
  return phoneNum;
 }
 public void setAdress(String a){
  this.adress = a;
 }
 public void setPhone(String num){
  this.phoneNum = num;
 }
public String toString(){
  return "Customer id: " +custId+ "\nCustomer Name: " +custId+ "\nAdress: " +adress+ "\nPhone Number: " +phoneNum;
 }
}