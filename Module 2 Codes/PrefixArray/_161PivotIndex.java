package PrefixArray;
import java.util.*;

public class _161PivotIndex {
    public static int[] prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                prefix[i] = arr[i];
            else
                prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int[] suffixSum(int[] arr) {
        int[] suffix = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1)
                suffix[i] = arr[i];
            else
                suffix[i] = suffix[i + 1] + arr[i];
        }
        return suffix;
    }

    public static int pivotIndex(int[] arr) {
        int[] prefix = prefixSum(arr);
        int[] suffix = suffixSum(arr);

        for (int i = 0; i < arr.length; i++) {
            if (prefix[i] == suffix[i])
                return i;
        }
        return -1;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.println(pivotIndex(arr));
    }
}
