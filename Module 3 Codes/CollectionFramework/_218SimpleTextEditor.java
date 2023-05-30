package CollectionFramework;

import java.util.*;

public class _218SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();

        ArrayList<Character> text = new ArrayList<>();
        Stack<Integer> options = new Stack<>();
        Stack<String> str = new Stack<>();

        while (tests-- > 0) {
            int option = scn.nextInt();

            switch (option) {
                case 1: {
                    // append W String: O(W.length())

                    String W = scn.next();
                    for (int idx = 0; idx < W.length(); idx++) {
                        char ch = W.charAt(idx);
                        text.add(ch);
                    }

                    options.push(1);
                    str.add(W);
                    break;
                }

                case 2: {
                    // delete last k characters

                    String deleted = "";
                    int k = scn.nextInt();
                    for (int idx = 0; idx < k; idx++) {
                        deleted += text.remove(text.size() - 1);
                    }

                    options.add(2);
                    str.add(deleted);
                    break;
                }

                case 3: {
                    // printing kth character (1-based)

                    int k = scn.nextInt();
                    System.out.println(text.get(k - 1));

                    break;
                }

                case 4: {
                    // undo operation
                    int choice = options.pop();
                    String w = str.pop();

                    if (choice == 1) {
                        // append -> undo -> delete last k characters
                        for (int i = 0; i < w.length(); i++) {
                            text.remove(text.size() - 1);
                        }
                    } else {
                        // delete k -> undo -> append characters
                        for (int i = w.length() - 1; i >= 0; i--) {
                            text.add(w.charAt(i));
                        }
                    }
                    break;
                }

                default: {
                }
            }
        }

        scn.close();
    }
}
