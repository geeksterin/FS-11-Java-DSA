package String;

import java.util.*;

public class _188CountUniqueDigits {
    public static int uniqueDigits(String str) {
        int[] freq = new int[10]; // digits '0' - '9'

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - '0']++;
        }

        int count = 0;
        for (int i = 0; i <= 9; i++) {
            if (freq[i] > 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(uniqueDigits(str));
        scn.close();
    }
}
