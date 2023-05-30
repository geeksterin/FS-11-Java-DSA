package String;

import java.util.*;

public class _193SumOfSubstrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        int sum = 0;
        for (int l = 0; l < str.length(); l++) {
            int substring = 0;
            for (int r = l; r < str.length(); r++) {
                int digit = str.charAt(r) - '0';
                substring = substring * 10 + digit;
                sum += substring;
            }
        }

        System.out.println(sum);
    }
}
