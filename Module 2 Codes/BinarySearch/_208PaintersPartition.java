package BinarySearch;

import java.util.*;

public class _208PaintersPartition {
    public static int maxOfArray(int[] boards) {
        int ans = boards[0];
        for (int i = 0; i < boards.length; i++) {
            ans = Math.max(ans, boards[i]);
        }
        return ans;
    }

    public static int sumOfArray(int[] boards) {
        int sum = 0;
        for (int i = 0; i < boards.length; i++) {
            sum += boards[i];
        }
        return sum;
    }

    public static boolean isPossible(int[] boards,
            int allowedTime, int allowedPainters) {
        int length = 0, reqPainters = 1;

        for (int i = 0; i < boards.length; i++) {
            if (length + boards[i] <= allowedTime) {
                length += boards[i];
            } else {
                reqPainters++;
                length = boards[i];
            }
        }

        return (reqPainters <= allowedPainters);
    }

    public static int paintersPartition(int[] boards, int painters) {
        int left = maxOfArray(boards); // painters = board.length
        int right = sumOfArray(boards); // painters = 1
        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPossible(boards, mid, painters) == true) {
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
        int[] boards = new int[n];
        for (int i = 0; i < n; i++) {
            boards[i] = scn.nextInt();
        }
        int painters = scn.nextInt();

        int time = paintersPartition(boards, painters);
        System.out.println(time);

        scn.close();
    }
}
