package Frequency;
import java.util.*;

public class _165GoodString {
    public static boolean isStringGood(String str) {
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        int needed = freq[str.charAt(0) - 'a'];
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (freq[ch - 'a'] > 0 && freq[ch - 'a'] != needed)
                return false;
        }

        return true;
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        System.out.println(isStringGood(str));
    }
}
