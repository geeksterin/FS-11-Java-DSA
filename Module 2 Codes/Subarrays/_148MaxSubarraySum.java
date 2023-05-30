import java.util.*;

public class _148MaxSubarraySum {
    public static int approach1(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int l = 0; l < arr.length; l++) {
            int sum = 0;
            for (int r = l; r < arr.length; r++) {
                sum += arr[r];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static int approach2(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.println(approach2(arr));
    }
}