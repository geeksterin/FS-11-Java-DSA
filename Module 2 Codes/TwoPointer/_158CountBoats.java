package TwoPointer;
import java.util.*;

public class _158CountBoats {
    public static int minBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1, boats = 0;
        while (l <= r) {
            if (arr[l] + arr[r] <= limit) {
                l++;
                r--;
                boats++;
            } else {
                r--;
                boats++;
            }
        }
        return boats;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int limit = scn.nextInt();

        System.out.println(minBoats(arr, limit));
    }
}
