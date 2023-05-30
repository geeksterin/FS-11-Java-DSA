package BinarySearch;

import java.util.*;

public class _207KokoEatingBananas {
    public static int linearsearch(int[] piles, int hours) {
        int max = 1000000000;
        for (int speed = 1; speed < max; speed++) {
            if (isPossible(piles, hours, speed) == true)
                return speed;
        }
        return max;
    }

    public static boolean isPossible(int[] piles, int hours, int speed) {
        int req = 0;
        for (int i = 0; i < piles.length; i++) {
            req += (piles[i] / speed);
            if (piles[i] % speed != 0)
                req++;
        }
        return (req <= hours);
    }

    public static int binarySearch(int[] piles, int hours) {
        int left = 1, right = 1000000000;
        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isPossible(piles, hours, mid) == true) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = scn.nextInt();
        }
        int hours = scn.nextInt();

        System.out.println(binarySearch(piles, hours));
        scn.close();
    }
}