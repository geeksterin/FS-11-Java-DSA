package String;

import java.util.*;

public class _199LongPressedKey {
    public static boolean longPressed(String str1, String str2) {
        int p1 = 0, p2 = 0;

        while (p1 < str1.length() && p2 < str2.length()) {
            char ch = str1.charAt(p1);
            int count1 = 0;
            while (p1 < str1.length() && str1.charAt(p1) == ch) {
                p1++;
                count1++;
            }

            int count2 = 0;
            while (p2 < str2.length() && str2.charAt(p2) == ch) {
                p2++;
                count2++;
            }

            if (count1 > count2)
                return false;
        }

        if (p1 < str1.length() || p2 < str2.length())
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str1 = scn.next();
        String str2 = scn.next();
        scn.close();

        System.out.println(longPressed(str1, str2));
    }
}
