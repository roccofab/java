public class Main{
 public static void main(String[] args){
  Product p = new Product("A25-F3", "Notebooks", 2.50, 200);
  Customer c = new Customer();
  System.out.println(p.toString());
  System.out.println(c.toString());
 }
}