package Sorting;
import java.util.*;

public class _141LargestNumber {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        Arrays.sort(arr, (a, b) -> {
            String x = "" + a + b;
            String y = "" + b + a;
            return x.compareTo(y);
            // lexicographical: increasing
        });

        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}