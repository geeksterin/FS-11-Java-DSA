package TwoPointer;
import java.util.*;

public class _143MinDifference {
    public static int minDifference(int[] arr, int n, int k) {
        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;

        for (int l = 0, r = k - 1; r < n; l++, r++) {
            if (arr[r] - arr[l] < diff)
                diff = arr[r] - arr[l];
        }

        return diff;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int k = scn.nextInt();
        System.out.println(minDifference(arr, n, k));
    }
}
