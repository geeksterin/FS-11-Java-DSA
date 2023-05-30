package CollectionFramework;

import java.util.*;

public class _236QueueUsingStack {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();

        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();

        // Approach 1
        // while (tests-- > 0) {
        // int option = scn.nextInt();

        // if (option == 1) {
        // // insert: O(1)
        // int x = scn.nextInt();
        // stk1.push(x);
        // } else if (option == 2) {
        // // remove: O(n)
        // while (stk1.size() > 0) {
        // stk2.push(stk1.pop());
        // }
        // stk2.pop();
        // while (stk2.size() > 0) {
        // stk1.push(stk2.pop());
        // }

        // } else {
        // // peek: O(n)
        // while (stk1.size() > 0) {
        // stk2.push(stk1.pop());
        // }
        // System.out.println(stk2.peek());
        // while (stk2.size() > 0) {
        // stk1.push(stk2.pop());
        // }
        // }
        // }

        // Approach 2
        while (tests-- > 0) {
            int option = scn.nextInt();

            if (option == 1) {
                // insert: O(n)
                int x = scn.nextInt();
                while (stk1.size() > 0) {
                    stk2.push(stk1.pop());
                }
                stk1.push(x);
                while (stk2.size() > 0) {
                    stk1.push(stk2.pop());
                }

            } else if (option == 2) {
                // remove: O(1)
                stk1.pop();
            } else {
                // peek: O(1)
                System.out.println(stk1.peek());
            }
        }
    }
}
