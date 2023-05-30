package BinarySearch;

import java.util.*;

public class _203SquareRoot {
    public static int squareRoot(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (((long) mid) * mid <= n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(squareRoot(n));
        scn.close();
    }
}
