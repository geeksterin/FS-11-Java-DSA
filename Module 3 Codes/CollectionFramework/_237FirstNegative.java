package CollectionFramework;

import java.util.*;

public class _237FirstNegative {
    public static void firstNegative(int[] arr, int k) {
        int left = 0, right = k - 1;
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = left; i <= right; i++) {
            if (arr[i] < 0)
                q.add(arr[i]);
        }

        while (right < arr.length) {
            if (q.size() == 0)
                System.out.print(0 + " ");
            else
                System.out.print(q.peek() + " ");

            if (arr[left] < 0)
                q.remove();
            left++;
            right++;
            if (right < arr.length && arr[right] < 0)
                q.add(arr[right]);
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        firstNegative(arr, k);
    }
}
