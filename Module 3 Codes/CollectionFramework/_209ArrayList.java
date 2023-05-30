package CollectionFramework;

import java.util.*;

public class _209ArrayList {
    public static void main(String[] args) {
        // Creation: Empty ArrayList
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums);

        // Insertion: O(N)
        for (int val = 10; val <= 50; val += 10) {
            nums.add(val);
            System.out.println(nums);
        }

        // Reading: Indexing: O(N)
        for (int idx = 0; idx < nums.size(); idx++) {
            System.out.print(nums.get(idx) + " ");
        }
        System.out.println();

        // Updation: O(N)
        for (int idx = 0; idx < nums.size(); idx++) {
            nums.set(idx, nums.get(idx) + 5);
            System.out.print(nums.get(idx) + " ");
        }
        System.out.println();

        nums.remove(0); // O(N)
        System.out.println(nums);

        nums.remove(nums.size() - 1); // O(1)
        System.out.println(nums);

        nums.add(0, 100); // O(N)
        System.out.println(nums);

        nums.add(2, 200);
        System.out.println(nums);
    }
}
