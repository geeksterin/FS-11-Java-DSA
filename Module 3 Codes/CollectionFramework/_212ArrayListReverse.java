package CollectionFramework;

import java.util.*;

public class _212ArrayListReverse {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        // Insertion: O(N)
        int n = scn.nextInt();
        while (n-- > 0) {
            int val = scn.nextInt();
            arr.add(val);
        }

        // For Loop: Reverse Order
        for (int idx = arr.size() - 1; idx >= 0; idx--) {
            System.out.print(arr.get(idx) + " ");
        }
        System.out.println();

        // Reversal of ArrayList

        // Syntax 1: Inbuilt Function
        Collections.reverse(arr);

        // Syntax 2: Two Pointer
        int left = 0, right = arr.size() - 1;
        while (left < right) {
            int backup = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, backup);
            left++;
            right--;
        }

        // Syntax 3: Two Pointer + Inbuilt Swap
        left = 0;
        right = arr.size() - 1;
        while (left < right) {
            Collections.swap(arr, left, right);
            left++;
            right--;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
