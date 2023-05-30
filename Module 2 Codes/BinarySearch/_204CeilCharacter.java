package BinarySearch;

import java.util.*;

public class _204CeilCharacter {
    public static String ceil(char[] arr, char target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left == arr.length)
            return "-1";
        return ("" + arr[left]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char target = scn.next().charAt(0);

        int n = scn.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next().charAt(0);
        }

        System.out.println(ceil(arr, target));
        scn.close();
    }
}
