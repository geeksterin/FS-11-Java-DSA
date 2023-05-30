package BinarySearch;

import java.util.*;

public class _206RotatedSorted {
    public static int pivotIndex(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= arr[0]) {
                // ROTATED : Go to Right
                left = mid + 1;
            } else {
                // NOT ROTATED: Go to Left
                right = mid - 1;
            }
        }

        // left -> minimum, right -> maximum
        return right;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(pivotIndex(arr));
        scn.close();
    }
}
