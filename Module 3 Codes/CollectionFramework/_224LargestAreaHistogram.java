package CollectionFramework;

import java.util.*;

public class _224LargestAreaHistogram {
    public static int[] nextSmallerLeft(int[] arr) {
        int[] left = new int[arr.length];

        // Monotonic Stack (Decreasing Order of Values)
        // Potential Answers
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // 1. Pop All Smaller or Equal Elements
            while (stk.size() > 0 && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }

            // 2. Find the NSE in left for Current Index
            if (stk.size() == 0)
                left[i] = -1;
            else
                left[i] = stk.peek();

            // 3. Push the Current Index
            stk.push(i);
        }

        return left;
    }

    public static int[] nextSmallerRight(int[] arr) {
        int[] right = new int[arr.length];

        // Monotonic Stack (Decreasing Order of Values)
        // Potential Answers
        Stack<Integer> stk = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1. Pop All Smaller or Equal Elements
            while (stk.size() > 0 && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }

            // 2. Find the NSE in right for Current Index
            if (stk.size() == 0)
                right[i] = arr.length;
            else
                right[i] = stk.peek();

            // 3. Push the Current Index
            stk.push(i);
        }

        return right;
    }

    public static int maxArea(int[] arr) {
        int[] nsl = nextSmallerLeft(arr);
        int[] nsr = nextSmallerRight(arr);

        int maximum = 0;
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            maximum = Math.max(maximum, area);
        }

        return maximum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(maxArea(arr));
        scn.close();
    }
}
