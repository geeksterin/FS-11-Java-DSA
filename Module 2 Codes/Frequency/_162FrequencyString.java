package Frequency;
import java.util.*;

@SuppressWarnings("all")
public class _162FrequencyString {
    public static void printFrequencies(String str) {
        int[] freq = new int[26]; // lowercase alphabets

        // 1. Building Frequency Array
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }

        // 2. Print Distinct Characters Frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            if (freq[idx] > 0) {
                System.out.println(ch + "-" + freq[idx]);
                freq[idx] = -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        printFrequencies(str);
    }
}
