//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store s = new Store();
        Customer customer1 = new Customer("Jonas");
        s.addMember(customer1);
        System.out.println("Member: " +s.getMember(0));
        s.inviteSale();
    }
}