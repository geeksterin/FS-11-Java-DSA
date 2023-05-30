package TwoPointer;
import java.util.*;

public class _144PeakIndex {
    public static int peakIndex(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                return i;
        }
        return -1; // there is no mountain
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        System.out.println(peakIndex(arr));
    }
}
