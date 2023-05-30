package CollectionFramework;

import java.util.*;

public class _234QueueMenu {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();

        while (tests-- > 0) {
            int option = scn.nextInt();

            switch (option) {
                case 1: {
                    // size = O(1)
                    System.out.println(q.size());
                    break;
                }

                case 2: {
                    // remove = O(1)
                    if (q.size() == 0)
                        System.out.println(-1);
                    else
                        q.remove();
                    break;
                }

                case 3: {
                    // insert x => O(1)
                    int x = scn.nextInt();
                    q.add(x);
                    break;
                }

                case 4: {
                    // peek => O(1)
                    if (q.size() == 0)
                        System.out.println(-1);
                    else
                        System.out.println(q.peek());
                    break;
                }

                default: {
                    break;
                }
            }
        }
    }
}
