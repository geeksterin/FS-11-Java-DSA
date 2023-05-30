package CollectionFramework;

import java.util.*;

public class _230TargetSumPair {
    public static int[] targetSumPair(int[] arr, int target) {
        // write your code here
        HashMap<Integer, Integer> visited = new HashMap<>();
        // key: element arr[i], value: index i

        for (int idx = 0; idx < arr.length; idx++) {
            if (visited.containsKey(target - arr[idx])) {
                int[] pair = new int[2];
                pair[0] = visited.get(target - arr[idx]);
                pair[1] = idx;
                return pair;
            }
            visited.put(arr[idx], idx);
        }

        return null; // only occur when there is no pair
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int target = scn.nextInt();

        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }

        int[] pair = targetSumPair(arr, target);
        System.out.println(pair[0] + " " + pair[1]);
        scn.close();
    }
}
