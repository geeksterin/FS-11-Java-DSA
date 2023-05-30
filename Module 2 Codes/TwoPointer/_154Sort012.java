package TwoPointer;
import java.util.*;

public class _154Sort012 {
    public static void approach1(int[] arr) {
        int[] count = new int[3]; // {0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count[0]++;
            else if (arr[i] == 1)
                count[1]++;
            else
                count[2]++;
        }

        int i = 0;
        while (count[0]-- > 0) {
            arr[i] = 0;
            i++;
        }
        while (count[1]-- > 0) {
            arr[i] = 1;
            i++;
        }
        while (count[2]-- > 0) {
            arr[i] = 2;
            i++;
        }
    }

    public static void approach2(int[] arr) {
        int i = 0, j = 0, k = arr.length - 1;

        while (j <= k) {
            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[j] == 1) {
                j++;
            } else {
                swap(arr, j, k);
                k--;
            }
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        approach2(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
