//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Route rc1 = new Route("Mitsubishi", "Pajero");
        Route rc2 = new Route("Volkswagen", "Golf");
        Thread t = new Thread(rc1);
        Thread t2 = new Thread(rc2);
        t.start();
        t2.start();
    }
}