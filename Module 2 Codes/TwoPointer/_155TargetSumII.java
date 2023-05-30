package TwoPointer;
import java.util.*;

public class _155TargetSumII {
    public static void printPairs(int[] arr, int target) {
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (l > 0 && arr[l] == arr[l - 1]) {
                l++; // discarding duplicates
            } else if (sum == target) {
                System.out.println(arr[l] + " " + arr[r]);
                l++;
                r--;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int target = scn.nextInt();

        printPairs(arr, target);
    }
}
