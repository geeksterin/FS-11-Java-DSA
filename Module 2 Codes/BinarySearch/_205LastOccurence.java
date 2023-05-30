package BinarySearch;

import java.util.*;

public class _205LastOccurence {
    public static int lastOccurence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int answer = -1; // target not present

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                answer = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        System.out.println(lastOccurence(arr, target));
        scn.close();
    }
}
