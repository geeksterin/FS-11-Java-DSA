package String;

import java.util.*;

public class _189SearchSubstring {
    public static boolean search(String str, int st, String target) {
        for (int i = 0, j = st; i < target.length(); i++, j++) {
            if (j == str.length())
                return false;
            if (str.charAt(j) != target.charAt(i))
                return false;
        }
        return true;
    }

    public static int findIndex(String str, String target) {
        for (int st = 0; st < str.length(); st++) {
            if (search(str, st, target) == true)
                return st;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        String target = scn.next();

        System.out.println(findIndex(str, target));
        scn.close();
    }
}
