package CollectionFramework;

import java.util.*;

public class _232LongestPalindrome {
    public static int longestPalindrome(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int longest = 0, isOdd = 0;

        for (int val : freq.values()) {
            if (val % 2 == 1) {
                isOdd = 1;
                val--;
            }
            longest += val;
        }

        return longest + isOdd;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(longestPalindrome(str));
        scn.close();
    }
}
