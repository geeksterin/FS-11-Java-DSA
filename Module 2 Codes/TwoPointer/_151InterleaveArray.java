package TwoPointer;
import java.util.*;

public class _151InterleaveArray {
    public static int[] interleave(int[] arr) {
        int x = 0, y = arr.length / 2, z = 0;
        int[] res = new int[arr.length];

        while (z < arr.length) {
            res[z] = arr[x];
            z++;
            x++;
            res[z] = arr[y];
            z++;
            y++;
        }

        return res;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] res = interleave(arr);
        for (int i = 0; i < n; i++)
            System.out.print(res[i] + " ");
    }
}
