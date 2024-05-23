import java.util.Scanner;

public class potenza {
    Scanner scan;
    int base;
    public potenza(int base) {
        this.base = base;
        this.scan =  new Scanner(System.in);
    }
    public void calcolaPotenza() {
        System.out.println(base*base);
    }
    public void cambioBase() {
        System.out.println("Inserisci la nuova base: ");
       this.base = scan.nextInt();
    }
}
