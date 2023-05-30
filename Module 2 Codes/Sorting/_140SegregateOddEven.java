package Sorting;
import java.util.*;

public class _140SegregateOddEven {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        Arrays.sort(arr, (a, b) -> {
            if ((a + b) % 2 == 0)
                return a - b; // Both Even or Both Odd -> Increasing
            else if (a % 2 == 0)
                return -1; // First Even And Second Odd -> No Swap
            else
                return +1; // First Odd And Second Even -> Swap
        });

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}