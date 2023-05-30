package Sorting;
import java.util.*;

public class _134SelectionSort {
    public static void swap(int[] arr, int p1, int p2) {
        int backup = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = backup;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j])
                    swap(arr, i, j);
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

        selectionSort(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
