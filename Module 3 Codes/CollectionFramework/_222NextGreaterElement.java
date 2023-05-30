package CollectionFramework;

import java.util.*;

public class _222NextGreaterElement {
    public static int[] approach1(int[] arr) {
        int[] nge = new int[arr.length];

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
                nge[i] = -1;
            else
                nge[i] = arr[stk.peek()];

            // 3. Push the Current Index
            stk.push(i);
        }

        return nge;
    }

    public static int[] approach2(int[] arr) {
        int[] nge = new int[arr.length];
        Arrays.fill(nge, -1); // initializing NGE as -1

        // Monotonic Stack: Increasing Order
        // Values whose NGE is yet to be discovered
        Stack<Integer> stk = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1. Pop Elements Whose NGE is Current Value
            while (stk.size() > 0 && arr[i] > arr[stk.peek()]) {
                nge[stk.pop()] = arr[i];
            }

            // 2. Push the Current index, NGE is yet to be found
            stk.push(i);
        }

        return nge;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] res = approach2(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        scn.close();
    }
}
