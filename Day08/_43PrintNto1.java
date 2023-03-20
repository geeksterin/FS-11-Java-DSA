package Day08;
import java.util.*;

public class _43PrintNto1 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int idx = n; idx >= 1; idx--) {
            System.out.println(idx);
        }
    }
}
