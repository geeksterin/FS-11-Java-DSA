package Sorting;
import java.util.*;

public class _133BubbleSort {
    public static void swap(int[] arr, int p1, int p2) {
        int backup = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = backup;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                if (arr[j - 1] > arr[j])
                    swap(arr, j - 1, j);
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

        bubbleSort(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}