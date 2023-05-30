package String;

import java.util.*;

public class _200MergeStrings {
    public static String merge(String str1, String str2) {
        String res = "";
        for (int i = 0; i < str1.length(); i++) {
            res += str1.charAt(i);
            res += str2.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str1 = scn.next();
        String str2 = scn.next();

        System.out.println(merge(str1, str2));
        scn.close();
    }
}
