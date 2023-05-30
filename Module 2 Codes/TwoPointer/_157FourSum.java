package TwoPointer;
import java.util.*;

public class _157FourSum {
    public static void printPairs(int[] arr, int l, int r, int p, int q, int target) {
        while (l < r) {
            int sum = arr[l] + arr[r] + arr[p] + arr[q];
            if (l > 0 && arr[l] == arr[l - 1]) {
                l++; // discarding duplicates
            } else if (sum == target) {
                System.out.println(arr[l] + " " + arr[r]
                        + " " + arr[p] + " " + arr[q]);
                l++;
                r--;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
    }

    public static void printQuadruplets(int[] arr, int target) {
        Arrays.sort(arr);
        for (int q = arr.length - 1; q >= 0; q--) {
            if (q < arr.length - 1 && arr[q] == arr[q + 1])
                continue;

            for (int p = q - 1; p >= 0; p--) {
                if (p < q - 1 && arr[p] == arr[p + 1])
                    continue;

                printPairs(arr, 0, p - 1, p, q, target);
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
        printQuadruplets(arr, target);
    }
}