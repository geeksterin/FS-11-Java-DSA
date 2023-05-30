import java.util.*;

public class _149MaxProductSubarray {
    public static long kadane(int[] arr) {
        long min = 1, max = 1, ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                min = Math.min(min * arr[i], (long) arr[i]);
                max = Math.max(max * arr[i], (long) arr[i]);
            } else {
                min = Math.min(max * arr[i], (long) arr[i]);
                max = Math.max(min * arr[i], (long) arr[i]);
            }
            ans = Math.max(ans, max);
        }

        return ans;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.println(kadane(arr));
    }
}