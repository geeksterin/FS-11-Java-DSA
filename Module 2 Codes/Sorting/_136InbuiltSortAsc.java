package Sorting;
import java.util.*;

public class _136InbuiltSortAsc {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        Arrays.sort(arr); // Dual Pivot Quick Sort
        // Time = O(n log n), Space = O(1) inplace

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
