package CollectionFramework;

import java.util.*;

public class _223StockSpan {
    public static int[] stockSpan(int[] arr) {
        int[] span = new int[arr.length];

        // Monotonic Stack (Increasing Order of Values)
        // Potential Answers
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // 1. Pop All Smaller or Equal Elements
            while (stk.size() > 0 && arr[stk.peek()] <= arr[i]) {
                stk.pop();
            }

            // 2. Find the NGE in left for Current Index
            if (stk.size() == 0)
                span[i] = i + 1;
            else
                span[i] = i - stk.peek();

            // 3. Push the Current Index
            stk.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] span = stockSpan(arr);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
        scn.close();
    }
}
