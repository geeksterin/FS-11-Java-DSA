package Sorting;
import java.util.*;

public class _139SortOnSquares {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        Arrays.sort(arr, (a, b) -> a * a - b * b);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
