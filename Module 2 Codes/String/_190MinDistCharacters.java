package String;

import java.util.*;

public class _190MinDistCharacters {
    public static int minDist(String str, char a, char b) {
        int p1 = 0, p2 = 0;
        while (p1 < str.length() && str.charAt(p1) != a) {
            p1++;
        }
        while (p2 < str.length() && str.charAt(p2) != b) {
            p2++;
        }
        int dist = Integer.MAX_VALUE;

        while (p1 < str.length() && p2 < str.length()) {
            dist = Math.min(dist, Math.abs(p1 - p2) - 1);

            if (p1 < p2) {
                p1++;
                while (p1 < str.length() && str.charAt(p1) != a) {
                    p1++;
                }
            } else {
                p2++;
                while (p2 < str.length() && str.charAt(p2) != b) {
                    p2++;
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char a = scn.next().charAt(0);
        char b = scn.next().charAt(0);

        System.out.println(minDist(str, a, b));
        scn.close();
    }
}
