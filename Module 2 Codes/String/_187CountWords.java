package String;

import java.util.*;

public class _187CountWords {
    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && (i == 0 || str.charAt(i - 1) == ' '))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(countWords(str));
        scn.close();
    }
}
