package CollectionFramework;

import java.util.*;

public class _244DroppingDiamonds {
    public static int maxDiamonds(int[] bags, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // Maximum Heap

        for (int diamonds : bags) {
            pq.add(diamonds);
        }

        int totalDiamonds = 0;

        while (pq.size() > 0 && k-- > 0) {
            int diamonds = pq.remove();
            totalDiamonds += diamonds;
            if (diamonds / 2 > 0)
                pq.add(diamonds / 2);
        }

        return totalDiamonds;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] bags = new int[n];
        for (int i = 0; i < n; i++) {
            bags[i] = scn.nextInt();
        }

        System.out.println(maxDiamonds(bags, k));
        scn.close();
    }
}
