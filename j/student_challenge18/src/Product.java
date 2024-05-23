class Product{
  String itemNumber;
  String name;
  double price;
  int quantity;

  public Product(String itemNumber, String name, double price, int quantity){
  this.itemNumber = itemNumber;
  this.name = name;
  this.price = price;
  this.quantity = quantity;
 }
 public String getitemNumber(){
   return itemNumber;
 }
 public String getName(){
  return name;
 }
 public double getPrice(){
  return price;
 }
 public int getQuantity(){
  return quantity;
 }
 public void setPrice(double p){
  this.price = p;
 }
 public void setQuantity(int q) {
  this.quantity = q;
 }
public String toString(){
  return "Item Number: " +itemNumber+ "\nProduct Name: " +name+ "\nPrice per Unit: " +price+ "\nQuantity Available: " +quantity;
 }
}