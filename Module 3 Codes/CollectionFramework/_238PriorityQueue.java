package CollectionFramework;

import java.util.*;

public class _238PriorityQueue {
    public static void main(String[] args) {
        // min heap -> minm value = highest priority
        // PriorityQueue<Integer> q = new PriorityQueue<>();

        // q.add(20); // O(log 1)
        // q.add(30); // O(log 2)
        // q.add(50); // O(log 3)
        // q.add(10); // O(log 4)
        // q.add(40); // O(log N)

        // while (q.size() > 0) {
        //     System.out.print(q.peek() + " "); // O(1)
        //     System.out.println(q.remove() + " "); // O(log n)
        // }

        // Max Heap: maxm value = highest priority
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        q.add(20); // O(log 1)
        q.add(30); // O(log 2)
        q.add(50); // O(log 3)
        q.add(10); // O(log 4)
        q.add(40); // O(log N)
        q.add(30); 

        while (q.size() > 0) {
            System.out.print(q.peek() + " "); // O(1)
            System.out.println(q.remove() + " "); // O(log n)
        }

    }
}
