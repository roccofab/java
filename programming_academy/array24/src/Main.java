import java.util.Random;
public class Main {
    public static int[][] SommaMatrici(int[][] matrice1, int[][] matrice2){
        int righe = matrice1.length;
        int colonne = matrice1[0].length;
        int[][] somma = new int[righe][colonne];
        for(int i=0; i<righe; i++){
            for(int j=0; j<colonne; j++){

                somma[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        return somma;
    }
    public static void StampaMatrici(int[][] matrice) {
        for(int i=0; i<matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrice1 = {
                {10, 5, 5},
                {2, 3, 5},
                {4, 2, 2}
        };
        int[][] matrice2 = {
                {10, 15, 5},
                {12, 3, 5},
                {5, 3, 2}
        };
        StampaMatrici(matrice1);
        System.out.println();
        StampaMatrici(matrice2);
        System.out.println();
        int[][] somma = SommaMatrici(matrice1, matrice2);
        for(int i=0; i<somma.length; i++) {
            for (int j = 0; j < somma[i].length; j++) {
                System.out.print(somma[i][j] + " ");
            }
            System.out.println();
        }
    }
}