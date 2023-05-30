package CollectionFramework;

import java.util.*;

public class _216ReverseString {
    public static String reverse(String str) {
        Stack<Character> stk = new Stack<>();

        // 1. Push All Characters in Stack (left to right)
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            stk.push(ch);
        }

        // 2. Pop All Characters (right to left) & Form Result
        String resultant = "";
        while (stk.size() > 0) {
            char ch = stk.pop();
            resultant += ch; // concatenation
        }

        return resultant;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(reverse(str));
        scn.close();
    }
}
