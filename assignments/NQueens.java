package assignments;

import java.io.*;

import java.util.*;

public class NQueens {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }
        for (int column = 0; column < chess.length; column++) {
            if (chess[row][column] == 0
                    && isQueenSafe(chess, row, column) == true) {
                chess[row][column] = 1;
                printNQueens(chess,
                        qsf + row + "-" + column + ", ", row + 1);
                chess[row][column] = 0;
            }
        }
    }

    public static boolean isQueenSafe(int[][] chess,
                                      int row, int column) {
        for (int i = row - 1, j = column - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = column; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = column + 1; i >= 0
                && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = column - 1; j >= 0; j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}
