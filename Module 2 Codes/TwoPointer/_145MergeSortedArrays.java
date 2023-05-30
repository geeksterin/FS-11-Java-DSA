package TwoPointer;
import java.util.*;

public class _145MergeSortedArrays {
    public static int[] merge(int[] a1, int[] a2) {
        int n = a1.length, m = a2.length;
        int[] res = new int[n + m];
        int p1 = 0, p2 = 0, p3 = 0;

        while (p1 < n && p2 < m) {
            if (a1[p1] <= a2[p2]) {
                res[p3] = a1[p1];
                p1++;
                p3++;
            } else {
                res[p3] = a2[p2];
                p2++;
                p3++;
            }
        }

        while (p1 < n) {
            res[p3] = a1[p1];
            p1++;
            p3++;
        }

        while (p2 < m) {
            res[p3] = a2[p2];
            p2++;
            p3++;
        }

        return res;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a1 = new int[n];
        for (int i = 0; i < n; i++)
            a1[i] = scn.nextInt();

        int m = scn.nextInt();
        int[] a2 = new int[m];
        for (int i = 0; i < m; i++)
            a2[i] = scn.nextInt();

        int[] res = merge(a1, a2);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }
}
