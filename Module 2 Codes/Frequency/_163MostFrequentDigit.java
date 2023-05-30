package Frequency;
import java.util.*;

public class _163MostFrequentDigit {
    public static int mostFrequenct(int[] arr) {
        int[] freq = new int[10];

        for (int i = 0; i < arr.length; i++)
            freq[arr[i]]++;

        int answer = 0;
        for (int i = 0; i <= 9; i++) {
            if (freq[i] > freq[answer])
                answer = i;
        }

        return answer;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(mostFrequenct(arr));
    }
}
