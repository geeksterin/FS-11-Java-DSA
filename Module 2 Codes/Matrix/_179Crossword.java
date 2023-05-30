package Matrix;

import java.util.*;

public class _179Crossword {
    public static boolean down(char[][] mat, int row, int col, String target) {
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            if (row == mat.length || mat[row][col] != ch)
                return false;
            row++;
        }
        return true;
    }

    public static boolean right(char[][] mat, int row, int col, String target) {
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            if (col == mat.length || mat[row][col] != ch)
                return false;
            col++;
        }
        return true;
    }

    public static boolean downleft(char[][] mat, int row, int col, String target) {
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            if (col == -1 || row == mat.length || mat[row][col] != ch)
                return false;
            row++;
            col--;
        }
        return true;
    }

    public static boolean downright(char[][] mat, int row, int col, String target) {
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            if (col == mat.length || row == mat.length || mat[row][col] != ch)
                return false;
            row++;
            col++;
        }
        return true;
    }

    public static boolean crossword(char[][] mat, String target) {
        int n = mat.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (down(mat, row, col, target) == true)
                    return true;
                if (right(mat, row, col, target) == true)
                    return true;
                if (downright(mat, row, col, target) == true)
                    return true;
                if (downleft(mat, row, col, target) == true)
                    return true;
            }
        }
        return false;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        char[][] mat = new char[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                mat[row][col] = scn.next().charAt(0);
            }
        }

        String target = scn.next();
        System.out.println(crossword(mat, target));
    }
}
