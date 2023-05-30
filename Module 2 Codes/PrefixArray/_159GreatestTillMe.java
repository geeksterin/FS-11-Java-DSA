package PrefixArray;
import java.util.*;

public class _159GreatestTillMe {
    public static int[] greatestTillMe(int[] arr) {
        int[] prefix = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                prefix[i] = arr[i];
            else
                prefix[i] = Math.max(prefix[i - 1], arr[i]);
        }
        return prefix;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] res = greatestTillMe(arr);
        for (int i = 0; i < n; i++)
            System.out.println(res[i]);
    }
}
