package Sorting;
import java.util.*;

public class _138CustomSort {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        Integer[] arr = new Integer[n];
        // int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        Arrays.sort(arr, (a, b) -> a - b);
        // Increasing Order

        Arrays.sort(arr, (a, b) -> b - a);
        // Decreasing Order

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}
