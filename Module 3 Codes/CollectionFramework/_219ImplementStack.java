package CollectionFramework;

import java.util.*;

public class _219ImplementStack {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> stk = new ArrayList<>();
        // empty stack: size == 0

        int tests = scn.nextInt();
        while (tests-- > 0) {
            String operation = scn.next();

            if (operation.equals("push") == true) {
                int x = scn.nextInt();
                stk.add(x); // insert at last : O(1)
            } else if (operation.equals("pop") == true) {
                if (stk.size() > 0)
                    stk.remove(stk.size() - 1);
                // remove from last : O(1)
            } else if (operation.equals("size") == true) {
                // size : O(1)
                System.out.println(stk.size());
            } else {
                // display: traversal: O(n)
                for (int val : stk) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
}