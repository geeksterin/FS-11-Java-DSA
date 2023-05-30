package CollectionFramework;

import java.util.*;

public class _240DestroyStones {
    public static int destroyStones(int[] arr) {
        // Max Heap -> Biggest Stones = Maximum Priority
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int val : arr) {
            pq.add(val);
        }

        while (pq.size() > 1) {
            int y = pq.remove();
            int x = pq.remove();
            if (x != y)
                pq.add(y - x);
        }

        if (pq.size() == 0)
            return 0; // no stones
        return pq.remove(); // 1 stone left
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(destroyStones(arr));
        scn.close();
    }
}
