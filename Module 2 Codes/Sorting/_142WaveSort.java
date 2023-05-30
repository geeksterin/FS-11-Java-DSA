package Sorting;
import java.util.*;

public class _142WaveSort {
    public static void swap(int[] arr, int x, int y) {
        int backup = arr[x];
        arr[x] = arr[y];
        arr[y] = backup;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        Arrays.sort(arr); // increasing order

        for (int i = 0; i < n - 1; i += 2) {
            swap(arr, i, i + 1);
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}