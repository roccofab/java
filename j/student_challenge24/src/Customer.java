public class Customer implements Member{
    String name;
    public Customer(String n){
        name = n;
    }
    @Override
    public void callback() {
      System.out.println("I will visit " +name);
    }
    @Override
    public String toString() {
        return name;
    }
}
