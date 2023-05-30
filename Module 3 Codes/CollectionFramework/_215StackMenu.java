package CollectionFramework;

import java.util.*;

public class _215StackMenu {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();

        Stack<Integer> stk = new Stack<>();
        // empty stack

        while (tests-- > 0) {
            int option = scn.nextInt();

            switch (option) {
                case 1: {
                    // Print Size
                    System.out.println(stk.size());
                    break;
                }

                case 2: {
                    // Remove
                    if (stk.size() == 0)
                        System.out.println(-1);
                    else
                        stk.pop();

                    break;
                }

                case 3: {
                    // Add or Insert
                    int x = scn.nextInt();
                    stk.push(x);
                    break;
                }

                case 4: {
                    // Print Top or Peek
                    if (stk.size() == 0)
                        System.out.println(-1);
                    else
                        System.out.println(stk.peek());

                    break;
                }

                default: {
                }
            }
        }
    }
}
