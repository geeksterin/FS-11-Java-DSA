package CollectionFramework;

import java.util.*;

public class _220BalancedParantheses {
    public static boolean balancedParantheses(String str) {
        Stack<Integer> unbalanced = new Stack<>();

        for (int idx = 0; idx < str.length(); idx++) {
            if (str.charAt(idx) == '(') {
                // open -> not balanced -> push
                unbalanced.push(idx);
            } else {
                if (unbalanced.size() == 0)
                    return false; 
                // extra closing (or close before open)
                else
                    unbalanced.pop();
            }
        }

        if (unbalanced.size() > 0)
            return false; // extra open
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(balancedParantheses(str));
        scn.close();
    }
}
