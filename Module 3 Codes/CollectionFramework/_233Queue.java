package CollectionFramework;

import java.util.*;

public class _233Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        for (int val = 10; val <= 50; val += 10) {
            q.add(val); // insert at last / rear
            System.out.println(q.peek() + " : " + q);
        }

        while (q.size() > 0) {
            System.out.print(q.remove() + " "); // remove from front
            System.out.println(q);
        }
    }
}
