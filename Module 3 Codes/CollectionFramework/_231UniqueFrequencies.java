package CollectionFramework;

import java.util.*;

public class _231UniqueFrequencies {
    public static boolean isUnique(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int ele : arr) {
            int oldFreq = freq.getOrDefault(ele, 0);
            freq.put(ele, oldFreq + 1);
        }

        HashSet<Integer> visited = new HashSet<>();

        for (int val : freq.values()) {
            if (visited.contains(val) == true) {
                return false;
            }
            visited.add(val);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        System.out.println(isUnique(arr));
        scn.close();
    }
}
