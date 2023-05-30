package TwoPointer;
import java.util.*;

public class _156ThreeSum {
    public static void printPairs(int[] arr, int l, int r, int m, int target) {
        while (l < r) {
            int sum = arr[l] + arr[r] + arr[m];
            if (l > 0 && arr[l] == arr[l - 1]) {
                l++; // discarding duplicates
            } else if (sum == target) {
                System.out.println(arr[l] + " " + arr[r] + " " + arr[m]);
                l++;
                r--;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
    }

    public static void printTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        for (int m = arr.length - 1; m >= 0; m--) {
            if (m == arr.length - 1 || arr[m] != arr[m + 1])
                printPairs(arr, 0, m - 1, m, target);
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        printTriplets(arr, 0);
    }
}