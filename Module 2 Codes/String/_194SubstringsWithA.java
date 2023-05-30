package String;

import java.util.*;

public class _194SubstringsWithA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        int count = 0;
        String longest = "";

        for (int l = 0; l < str.length(); l++) {
            for (int r = l + 1; r < str.length(); r++) {
                if (str.charAt(l) != 'A')
                    continue;
                if (str.charAt(r) != 'A')
                    continue;

                String sub = str.substring(l, r + 1);
                count++;
                if (sub.length() > longest.length())
                    longest = sub;
            }
        }

        System.out.println(count);
        System.out.println(longest.length());

        if (count == 0)
            System.out.println("-1");
        else
            System.out.println(longest);
    }
}
