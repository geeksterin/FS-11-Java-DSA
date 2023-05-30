package TwoPointer;
import java.util.*;

public class _150ReverseArray {
    public static void swap(int[] arr, int l, int r) {
        int backup = arr[l];
        arr[l] = arr[r];
        arr[r] = backup;
    }

    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        reverse(arr);
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}
