package String;

import java.util.*;

public class _191PalindromeString {
    public static String isPalindrome(String str) {
        int l = 0, r = str.length() - 1;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r))
                return "Not a Palindrome";
            l++;
            r--;
        }

        return "Palindrome";
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(isPalindrome(str));
        scn.close();
    }
}
