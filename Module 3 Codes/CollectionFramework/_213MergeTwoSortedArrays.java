package CollectionFramework;

import java.util.*;

public class _213MergeTwoSortedArrays {
    public static ArrayList<Integer> merge(int[] a1, int[] a2) {
        int n1 = a1.length, n2 = a2.length;
        int p1 = 0, p2 = 0;
        ArrayList<Integer> res = new ArrayList<>();

        while (p1 < n1 && p2 < n2) {
            if (a1[p1] <= a2[p2]) {
                if (res.size() == 0 || res.get(res.size() - 1) != a1[p1]) {
                    res.add(a1[p1]);
                }
                p1++;
            } else {
                if (res.size() == 0 || res.get(res.size() - 1) != a2[p2]) {
                    res.add(a2[p2]);
                }
                p2++;
            }
        }

        while (p1 < n1) {
            if (res.size() == 0 || res.get(res.size() - 1) != a1[p1]) {
                res.add(a1[p1]);
            }
            p1++;
        }

        while (p2 < n2) {
            if (res.size() == 0 || res.get(res.size() - 1) != a2[p2]) {
                res.add(a2[p2]);
            }
            p2++;
        }

        return res;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int idx = 0; idx < n1; idx++) {
            a1[idx] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int idx = 0; idx < n2; idx++) {
            a2[idx] = scn.nextInt();
        }

        ArrayList<Integer> res = merge(a1, a2);
        for (int idx = 0; idx < res.size(); idx++) {
            System.out.print(res.get(idx) + " ");
        }
    }
}
