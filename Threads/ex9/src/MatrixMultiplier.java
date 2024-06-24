public class MatrixMultiplier implements Runnable{
    int row;
    int col;
    int[][] m1;
    int[][] m2;
    int[][] m3;

    public MatrixMultiplier(int row, int col, int[][] m1, int[][] m2, int[][] m3){
        this.row = row;
        this.col = col;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    @Override
    public void run() {
        m3[row][col] = 0;
        for(int i = 0; i < 3; i++){
            m3[row][col] += m1[row][i] * m2[i][col];
        }
    }
}
