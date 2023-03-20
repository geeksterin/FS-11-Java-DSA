package Day09;
import java.util.*;

public class _48PrintSeries {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for (int idx = n; idx > 0; idx -= 3) {
            System.out.println(idx);
        }

    }
}
