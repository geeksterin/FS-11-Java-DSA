package CollectionFramework;

import java.util.*;

public class _229FreqOfCharacters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();

        TreeMap<Character, Integer> freq = new TreeMap<>();
        // sorted keys (ascii), values = frequency of character

        while (tests-- > 0) {
            char ch = scn.next().charAt(0);
            int oldFreq = freq.getOrDefault(ch, 0);
            freq.put(ch, oldFreq + 1);
        }

        for (Character ch : freq.keySet()) {
            int occ = freq.get(ch);
            System.out.println(ch + " " + occ);
        }

        scn.close();
    }
}
