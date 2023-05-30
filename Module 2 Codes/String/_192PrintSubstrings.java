package String;

import java.util.*;

public class _192PrintSubstrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        scn.close();

        // for (int l = 0; l < str.length(); l++) {
        // for (int r = l; r < str.length(); r++) {
        // for (int i = l; i <= r; i++) {
        // System.out.print(str.charAt(i));
        // }
        // System.out.println();
        // }
        // }

        for (int l = 0; l < str.length(); l++) {
            for (int r = l; r < str.length(); r++) {
                System.out.println(str.substring(l, r + 1));
            }
        }
    }
}
