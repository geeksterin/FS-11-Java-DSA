package String;

import java.util.*;

public class _196IsSubsequence {
    public static String isSubsequence(String str, String target) {
        int p1 = 0, p2 = 0;

        while (p1 < str.length() && p2 < target.length()) {
            if (str.charAt(p1) == target.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }

        if (p1 == str.length())
            return "True";
        else
            return "False";
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String target = scn.next();

        scn.close();
        System.out.println(isSubsequence(str, target));
    }
}
