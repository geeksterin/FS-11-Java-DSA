package CollectionFramework;

import java.util.*;

public class _211ArrayListTraversal {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Time: Inserting N Elements: O(N)
        while (n-- > 0) {
            int x = scn.nextInt();
            arr.add(x); // insert last: O(1)
        }

        // Traversal 1: For Loop : O(N)
        for (int idx = 0; idx < arr.size(); idx++) {
            int val = arr.get(idx);
            System.out.print(val + " ");
        }
        System.out.println();

        // Traversal 2: For Each Loop : O(N)
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}
