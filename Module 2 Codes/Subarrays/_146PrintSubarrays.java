import java.util.*;

public class _146PrintSubarrays {
    public static void printSubarrays(int[] arr) {
        for (int l = 0; l < arr.length; l++) {
            for (int r = l; r < arr.length; r++) {
                for (int i = l; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        printSubarrays(arr);
    }
}
