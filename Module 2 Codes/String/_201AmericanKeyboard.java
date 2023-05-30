package String;
import java.util.*;

public class _201AmericanKeyboard {
    public static int[] mapArray() {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        int[] map = new int[26];
        for (int i = 0; i < row1.length(); i++) {
            char ch = row1.charAt(i);
            map[ch - 'a'] = 1;
        }

        for (int i = 0; i < row2.length(); i++) {
            char ch = row2.charAt(i);
            map[ch - 'a'] = 2;
        }

        for (int i = 0; i < row3.length(); i++) {
            char ch = row3.charAt(i);
            map[ch - 'a'] = 3;
        }

        return map;
    }
    
    public static void helper(String str, int[] map) {
        int row = map[str.charAt(0) - 'a'];
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            if (map[ch - 'a'] != row)
                return;
        }
        System.out.print(str + " ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }

        int[] map = mapArray();
        for (int i = 0; i < arr.length; i++) {
            helper(arr[i], map);
        }
        scn.close();
    }
}
