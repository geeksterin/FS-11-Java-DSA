package Matrix;

import java.util.*;

public class _174Convert1Dto2D {
    public static int[][] convert(int[] arr, int rows, int cols) {
        int[][] mat = new int[rows][cols];

        for (int i = 0; i < arr.length; i++) {
            int row = i / cols;
            int col = i % cols;
            mat[row][col] = arr[i];
        }

        return mat;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int rows = scn.nextInt();
        int cols = scn.nextInt();

        int[][] mat = convert(arr, rows, cols);
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}
