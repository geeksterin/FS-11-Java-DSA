package CollectionFramework;

import java.util.*;

public class _217RemoveAdjacentDuplicates {
    public static int removeAdjacent(String[] arr) {
        Stack<String> stk = new Stack<>();
        // empty stack (0 size)

        for (String str : arr) {
            if (stk.size() == 0 || str.equals(stk.peek()) == false) {
                // no adjacent OR no duplicate adjacent
                stk.push(str);
            } else {
                // adjacent duplciate: do not push
                stk.pop(); // pairwise deletion
            }
        }

        return stk.size();
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.next();
        }

        System.out.println(removeAdjacent(arr));
    }
}
