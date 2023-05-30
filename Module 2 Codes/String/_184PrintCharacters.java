package String;

import java.util.*;

public class _184PrintCharacters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            System.out.println(ch);
        }

        scn.close();
    }
}
