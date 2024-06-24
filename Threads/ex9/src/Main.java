//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [][] m1 = {{1, 2, 3}, {5, 5, 5}, {2, 2, 2}};
        int[][] m2 = {{2, 2, 2}, {3, 3, 3}, {4, 4, 4}};
        int[][] m3 = new int[3][3];
        Thread[][] threads = new Thread[3][3];
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                threads[i][j] = new Thread(new MatrixMultiplier(i, j, m1, m2, m3));
                threads[i][j].start( );
            }
        }
        for(int i = 0; i < threads.length; i++){
            for (int j = 0; j < threads[i].length; j++) {
                try {
                    threads[i][j].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}