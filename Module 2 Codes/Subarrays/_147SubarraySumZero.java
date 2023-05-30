import java.util.*;

public class _147SubarraySumZero {
    public static boolean subarraySumZeroBruteForce(int[] arr) {
        for (int l = 0; l < arr.length; l++) {
            for (int r = l; r < arr.length; r++) {
                int sum = 0;
                for (int i = l; i <= r; i++) {
                    sum += arr[i];
                }
                if (sum == 0)
                    return true;
            }
        }
        return false;
    }

    public static boolean subarraySumZero(int[] arr) {
        for (int l = 0; l < arr.length; l++) {
            int sum = 0;
            for (int r = l; r < arr.length; r++) {
                sum += arr[r];
                if (sum == 0)
                    return true;
            }
        }
        return false;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.println(subarraySumZero(arr));
    }
}
