package CollectionFramework;
import java.util.*;

public class _214Stack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        // empty stack: stk.size() == 0

        System.out.println(stk.size() + " : " + stk);

        for (int val = 10; val <= 50; val += 10) {
            stk.push(val);
            System.out.println(stk.peek() + " : " + stk.size() + " : " + stk);
        }

        while (stk.size() > 0) {
            System.out.print(stk.pop() + " : ");
            System.out.println(stk.size() + " : " + stk);
        }
    }
}
