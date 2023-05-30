package CollectionFramework;

import java.util.*;

public class _245MedianOfRunningIntegers {
    public static void getMedian(int[] arr) {
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        PriorityQueue<Integer> right = new PriorityQueue<>(); // min heap

        for (int val : arr) {
            // Insertion
            if (left.size() == 0 || val < left.peek()) {
                left.add(val);
            } else {
                right.add(val);
            }

            // Shifting or Balancing
            if (left.size() - right.size() >= 2) {
                right.add(left.remove());
            } else if (right.size() - left.size() >= 2) {
                left.add(right.remove());
            }

            // Calculating Median
            if ((left.size() + right.size()) % 2 == 0) {
                double median = (left.peek() + right.peek()) / 2.0;
                System.out.println(median);
            } else if (left.size() > right.size()) {
                double median = left.peek();
                System.out.println(median);
            } else {
                double median = right.peek();
                System.out.println(median);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        getMedian(arr);
        scn.close();
    }
}
