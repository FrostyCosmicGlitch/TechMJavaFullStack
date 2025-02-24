class MatrixMultiplication extends Thread {
    private int[][] A, B, C;
    private int row, col, size;

    public MatrixMultiplication(int[][] A, int[][] B, int[][] C, int row, int col, int size) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
        this.col = col;
        this.size = size;
    }

    public void run() {
        C[row][col] = 0;
        for (int k = 0; k < size; k++) {
            C[row][col] += A[row][k] * B[k][col];
        }
    }
}

public class MultiThreadedMatrixMultiplication {
    public static void main(String[] args) throws InterruptedException {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int size = A.length;
        int[][] C = new int[size][size];

        Thread[][] threads = new Thread[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                threads[i][j] = new MatrixMultiplication(A, B, C, i, j, size);
                threads[i][j].start();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                threads[i][j].join();
            }
        }

        System.out.println("Resultant Matrix:");
        for (int[] row : C) {
            System.out.println(Arrays.toString(row));
        }
    }
}
