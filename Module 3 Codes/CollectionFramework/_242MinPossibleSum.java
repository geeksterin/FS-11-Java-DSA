package CollectionFramework;

import java.util.*;

public class _242MinPossibleSum {
    public static long minSum(int[] arr) {
        long a = 0, b = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int idx = 0; idx < arr.length; idx++) {
            pq.add(arr[idx]);
        }

        boolean flag = false;
        while (pq.size() > 0) {
            int digit = pq.remove();

            if (flag == false) {
                a = a * 10 + digit;
                flag = true;
            } else {
                b = b * 10 + digit;
                flag = false;
            }
        }

        return (a + b);
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        System.out.println(minSum(arr));
    }
}
