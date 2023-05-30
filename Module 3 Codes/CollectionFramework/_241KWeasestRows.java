package CollectionFramework;

import java.util.*;

public class _241KWeasestRows {
    public static int countSoldiers(int[][] mat, int row) {
        int count = 0;
        for (int col = 0; col < mat[0].length; col++) {
            if (mat[row][col] == 1)
                count++;
            else
                break;
        }
        return count;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int k = scn.nextInt();

        int[][] mat = new int[rows][cols];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                mat[row][col] = scn.nextInt();
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a[1] < b[1]) {
                        // first row less soldiers: higher priority
                        return -1;
                    } else if (a[1] > b[1]) {
                        // second row less soldiers: higher priority
                        return +1;
                    } else {
                        // same soldiers: smaller row index: higher priority
                        return a[0] - b[0];
                    }
                });

        for (int row = 0; row < mat.length; row++) {
            int soldiers = countSoldiers(mat, row);
            int[] arr = new int[2];
            arr[0] = row;
            arr[1] = soldiers;
            pq.add(arr);
        }

        while (k-- > 0) {
            int[] weakest = pq.remove();
            System.out.print(weakest[0] + " ");
        }
    }
}