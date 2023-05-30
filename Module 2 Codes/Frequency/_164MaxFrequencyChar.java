package Frequency;
import java.util.*;

public class _164MaxFrequencyChar {
    public static char mostFrequent(String str) {
        int[] freq = new int[26];

        // 1. Building the frequency array
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        char answer = 'a';
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (freq[ch - 'a'] > freq[answer - 'a'])
                answer = ch;
        }
        return answer;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        System.out.println(mostFrequent(str));
    }
}
