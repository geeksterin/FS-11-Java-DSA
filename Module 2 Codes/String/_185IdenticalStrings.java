package String;

import java.util.*;

public class _185IdenticalStrings {
    public static boolean isIdentical(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int idx = 0; idx < s1.length(); idx++) {
            if (s1.charAt(idx) != s2.charAt(idx))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s1 = scn.next();
        String s2 = scn.next();

        // System.out.println(isIdentical(s1, s2));
        System.out.println(s1.equals(s2));
        // or 
        System.out.println(s2.equals(s1));
        
        scn.close();
    }
}
