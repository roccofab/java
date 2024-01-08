import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] voti = {25, 27, 31, 18, 22, 10, 15, 29, 30, 21, 15, 14, 11};
        int somma = 0;
        int i = 0;
        for(int voto : voti) {
            somma += voto;
            i++;
        }
        double media = somma / voti.length;
        System.out.println(" I voti sono " +i+ "  e la media è " +media);
    }
}