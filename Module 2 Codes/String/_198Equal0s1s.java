package String;

import java.util.*;

public class _198Equal0s1s {
    public static int countSubstrings(String str) {
        int ans = 0;

        // 0s then 1s
        int idx = 0;
        while (idx < str.length()) {
            int zeros = 0;
            while (idx < str.length() && str.charAt(idx) == '0') {
                zeros++;
                idx++;
            }

            int ones = 0;
            while (idx < str.length() && str.charAt(idx) == '1') {
                ones++;
                idx++;
            }

            ans += Math.min(zeros, ones);
        }

        // 1s then 0s
        idx = 0;
        while (idx < str.length()) {
            int ones = 0;
            while (idx < str.length() && str.charAt(idx) == '1') {
                ones++;
                idx++;
            }

            int zeros = 0;
            while (idx < str.length() && str.charAt(idx) == '0') {
                zeros++;
                idx++;
            }

            ans += Math.min(zeros, ones);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(countSubstrings(str));
        scn.close();
    }
}
