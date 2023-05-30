package CollectionFramework;

import java.util.*;

public class _225HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> ipl = new HashMap<>();
        // empty hashmap

        // insertion of key-value pairs
        ipl.put("CSK", 4); // O(1) avg, O(n) worst
        ipl.put("MI", 5); // O(1) avg
        ipl.put("DC", 0); // O(1) avg
        ipl.put("RCB", 0); // O(1) avg
        ipl.put("SRH", 2); // O(1) avg

        System.out.println(ipl); // random order : O(n)

        // updation of key-value pairs
        ipl.put("DC", 1); // O(1) avg, O(n) worst
        ipl.put("CSK", 5);
        System.out.println(ipl);

        // read on keys: O(1) avg, O(n) worst
        System.out.println(ipl.containsKey("CSK"));
        System.out.println(ipl.containsKey("RCB"));
        System.out.println(ipl.containsKey("GT"));

        System.out.println(ipl.get("CSK"));
        System.out.println(ipl.get("RCB"));
        System.out.println(ipl.get("GT"));

        System.out.println(ipl.getOrDefault("CSK", -1));
        System.out.println(ipl.getOrDefault("RCB", -1));
        System.out.println(ipl.getOrDefault("GT", -1));

        // remove the key-value pairs : O(1) avg, O(n) worst
        ipl.remove("SRH"); // deleteing key-value pairs
        ipl.remove("GT"); // ignored: key is not present
        System.out.println(ipl);

        // Iteration or Traversal: Random Order : O(n) avg
        for (String iplTeam : ipl.keySet()) {
            System.out.println(iplTeam + ": " + ipl.get(iplTeam));
        }
    }
}
