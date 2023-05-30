package TwoPointer;
import java.util.*;

public class _153Sort01 {
    public static void approach1(int[] arr) {
        Arrays.sort(arr);
        // Time = O(N log N), Space = O(1) In-place
    }

    public static void approach2(int[] arr) {
        int count0 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count0++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < count0)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void approach3(int[] arr) {
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else
                j++;
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        approach3(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
