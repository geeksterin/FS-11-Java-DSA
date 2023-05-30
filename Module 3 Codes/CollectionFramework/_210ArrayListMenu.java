package CollectionFramework;

import java.util.*;

public class _210ArrayListMenu {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        int tests = scn.nextInt();
        while (tests-- > 0) {
            int option = scn.nextInt();

            switch (option) {
                case 1: {
                    // size
                    System.out.println(nums.size());
                    break;
                }
                case 2: {
                    // remove last element
                    if (nums.size() == 0)
                        System.out.println("invalid-move");
                    else
                        System.out.println(nums.remove(nums.size() - 1));
                    break;
                }
                case 3: {
                    // insert at last
                    int x = scn.nextInt();
                    nums.add(x);
                    System.out.println(nums.get(nums.size() - 1));
                    break;
                }
                case 4: {
                    // remove first element
                    if (nums.size() == 0)
                        System.out.println("invalid-move");
                    else
                        System.out.println(nums.remove(0));
                    break;
                }
                case 5: {
                    // insert at first
                    int x = scn.nextInt();
                    nums.add(0, x);
                    System.out.println(nums.get(0));
                    break;
                }
                case 6: {
                    if (nums.size() == 0) {
                        System.out.println("invalid-move");
                    } else {
                        for (int idx = 0; idx < nums.size(); idx++) {
                            System.out.print(nums.get(idx) + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                default: {
                }
            }
        }
    }
}
