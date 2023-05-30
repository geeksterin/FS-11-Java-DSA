package CollectionFramework;

import java.util.*;

public class _239PriorityQueueMenu {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // min heap => smallest value = highest priority

        while (tests-- > 0) {
            int option = scn.nextInt();

            if (option == 1) {
                // size = O(1)
                System.out.println(pq.size());
            } else if (option == 2) {
                // remove = O(log N)
                if (pq.size() > 0)
                    pq.remove();
                else
                    System.out.println(-1);

            } else if (option == 3) {
                // insert = O(log N)
                int x = scn.nextInt();
                pq.add(x);
            } else {
                // peek = O(1)
                if (pq.size() > 0)
                    System.out.println(pq.peek());
                else
                    System.out.println(-1);
            }
        }
    }
}
