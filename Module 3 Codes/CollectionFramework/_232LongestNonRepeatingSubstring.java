package CollectionFramework;

import java.util.*;

public class _232LongestNonRepeatingSubstring {
    public static int longestSubstring(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, answer = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            int last = map.getOrDefault(ch, -1);
            left = Math.max(left, last + 1); // discard duplicates
            map.put(ch, right); // update the last occurence
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(longestSubstring(str));
        scn.close();
    }
}
