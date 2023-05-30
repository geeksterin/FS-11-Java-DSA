package CollectionFramework;

import java.util.*;

public class _243MinOperations {
    public static int minMoves(int[] arr) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > 0)
                q.add(arr[idx]);
        }

        int moves = 0, curr = 0;
        while (q.size() > 0) {
            int val = q.remove();
            if (val != curr) {
                moves++;
                curr = val;
            }
        }

        return moves;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(minMoves(arr));
    }
}
