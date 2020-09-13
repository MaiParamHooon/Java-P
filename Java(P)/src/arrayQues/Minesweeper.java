package arrayQues;

import java.util.Scanner;

public class Minesweeper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n =sc.nextInt();
        int k = sc.nextInt();
        boolean[][] minesGrid = new boolean[m][n];
        int[][] countGrid = new int[m][n];
        int row = 0;
        int col = 0;
        for (int i = 0; i < k; i++) {
            row = (int) (Math.random() * m);
            col = (int) (Math.random() * n);
            if (!minesGrid[row][col]) {
                minesGrid[row][col] = true;
                if (row > 0) countGrid[row - 1][col]++;
                if (col > 0) countGrid[row][col - 1]++;
                if (row < m - 1) countGrid[row + 1][col]++;
                if (col < n - 1) countGrid[row][col + 1]++;
                if (row > 0 && col > 0) countGrid[row - 1][col - 1]++;
                if (row < m - 1 && col < n - 1) countGrid[row + 1][col + 1]++;
                if (row > 0 && col < n - 1) countGrid[row - 1][col + 1]++;
                if (row < m - 1 && col > 0) countGrid[row + 1][col - 1]++;
            }
            else {
                i--;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (minesGrid[i][j]) System.out.print("*  ");
                else System.out.print(countGrid[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
