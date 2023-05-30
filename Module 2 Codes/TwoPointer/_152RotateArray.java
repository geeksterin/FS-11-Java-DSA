package TwoPointer;
import java.util.*;

public class _152RotateArray {
    public static void rotateBy1(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void approach1(int[] arr, int k) {
        for (int j = 0; j < k; j++)
            rotateBy1(arr);
    }

    public static void swap(int[] arr, int l, int r) {
        int backup = arr[l];
        arr[l] = arr[r];
        arr[r] = backup;
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void approach2(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int k = scn.nextInt();

        approach2(arr, k);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
