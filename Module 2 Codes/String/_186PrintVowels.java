package String;

import java.util.*;

public class _186PrintVowels {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                    || ch == 'u' || ch == 'A' || ch == 'E'
                    || ch == 'I' || ch == 'O' || ch == 'U')
                System.out.print(i + " ");
        }

        scn.close();
    }
}
