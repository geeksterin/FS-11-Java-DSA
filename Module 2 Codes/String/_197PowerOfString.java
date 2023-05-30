package String;

import java.util.*;

public class _197PowerOfString {
    public static int power(String str) {
        int r = 0, ans = 0, n = str.length();
        while (r < n) {
            int l = r;
            while (r < n && str.charAt(l) == str.charAt(r)) {
                r++;
            }
            ans = Math.max(ans, r - l);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(power(str));
        scn.close();
    }
}
