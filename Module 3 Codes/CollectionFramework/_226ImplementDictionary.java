package CollectionFramework;
import java.util.*;

public class _226ImplementDictionary {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        HashMap<String, String> dict = new HashMap<>();
        // empty dictionary

        while (true) {
            int option = scn.nextInt();

            switch (option) {
                case 1: {
                    // insertion or updation
                    String word = scn.next(); // key
                    String meaning = scn.next(); // value
                    dict.put(word, meaning);
                    break;
                }

                case 2: {
                    // read operation
                    String word = scn.next();
                    String meaning = dict.getOrDefault(word, "-1");
                    System.out.println(meaning);
                    break;
                }

                case 3: {
                    // remove operation
                    String word = scn.next();
                    dict.remove(word);
                    break;
                }

                default: {
                    return;
                }
            }
        }
    }
}
