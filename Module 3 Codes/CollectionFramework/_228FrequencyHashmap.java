package CollectionFramework;

import java.util.*;

public class _228FrequencyHashmap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<Integer, Integer> freq = new HashMap<>();
        // key -> element arr[i], value -> frequency of element

        int tests = scn.nextInt();

        while (tests-- > 0) {
            int ele = scn.nextInt();
            int oldFreq = freq.getOrDefault(ele, 0);
            freq.put(ele, oldFreq + 1); // insert or update
        }

        for (Integer ele : freq.keySet()) {
            if (freq.get(ele) == Math.abs(ele)) {
                System.out.println(ele);
            }
        }

        scn.close();
    }
}
