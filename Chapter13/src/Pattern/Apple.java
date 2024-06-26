package Pattern;

public class Apple {
    public static void main(String[] args) {
        int n = 5;
        int[][] spiral = new int[n][n];
        int value = 1;
        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;
        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = value++;
            }
            for (int i = maxCol - 1; i >= minCol; i--) {
                spiral[maxRow][i] = value++;
            }
            for (int i = maxRow - 1; i > minRow; i--) {
                spiral[i][minCol] = value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 18; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
