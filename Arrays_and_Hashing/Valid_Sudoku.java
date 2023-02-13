package Arrays_and_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Valid_Sudoku {

    public boolean checkRow(char[][] board, int i, int j) {
        for (int k = 0; k < 9; k++) {
            if (k == j) {
                continue;
            }

            if (board[i][k] != '.' && board[i][k] == board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkColumn(char[][] board, int i, int j) {
        for (int k = 0; k < 9; k++) {
            if (k == i) {
                continue;
            }

            if (board[k][j] != '.' && board[k][j] == board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkSubMatrix(char[][] board, int i, int j) {

        ArrayList<Character> matrix = new ArrayList<Character>();
        for (int p = i; p < i + 3; p++) {
            for (int q = j; q < j + 3; q++) {
                matrix.add(board[p][q]);
            }
        }

        Set<Character> s = new HashSet<Character>();

        for (char c : matrix) {
            if (c == '.') {
                continue;
            }
            if (s.add(c) == false) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                //check row
                if (!checkRow(board, i, j)) {
                    return false;
                }

                //check column
                if (!checkColumn(board, i, j)) {
                    return false;
                }
            }
        }

        //check sub matrix
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0 || i == 3 || i == 6) && (j == 0 || j == 3 || j == 6)) {
                    if (!checkSubMatrix(board, i, j)) {
                        return false;
                    }
                }
            }
        }

        System.out.println("Valid!");
        return true;
    }
}
