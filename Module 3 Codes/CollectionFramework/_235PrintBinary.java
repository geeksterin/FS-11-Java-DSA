package CollectionFramework;

import java.util.*;

public class _235PrintBinary {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Queue<String> q = new ArrayDeque<>();
        q.add("1"); // n = 1

        for (int i = 1; i <= n; i++) {
            String binary = q.remove();
            System.out.print(binary + " ");
            q.add(binary + "0");
            q.add(binary + "1");
        }
    }
}
