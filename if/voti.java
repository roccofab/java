import java.util.Scanner;
public class voti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
        System.out.println("Inserire voto: ");
        int voto = input.nextInt();
        if(voto == 30) {
            System.out.println("A");
        } else if(voto >= 25 && voto <= 29) {
            System.out.println("B");
        } else if(voto >= 20 && voto <= 24) {
            System.out.println("C");
        } else if(voto >= 15 && voto <= 19 ) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
    }
}