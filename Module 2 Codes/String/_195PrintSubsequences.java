package String;

import java.util.*;

public class _195PrintSubsequences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        int subsets = (int) Math.pow(2, str.length());
        for (int i = 0; i < subsets; i++) {
            int num = i;
            String ans = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                char ch = str.charAt(j);

                if (num % 2 == 0)
                    ans = ch + ans;
                num /= 2;
            }
            System.out.print(ans + " ");
        }
    }
}
