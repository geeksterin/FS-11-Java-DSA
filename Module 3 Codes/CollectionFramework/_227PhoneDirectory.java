package CollectionFramework;

import java.util.*;

public class _227PhoneDirectory {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String, String> directory = new HashMap<>();
        // empty phone directory: name as key, phoneNo as value

        while (true) {
            int option = scn.nextInt();

            switch (option) {
                case 1: {
                    // insertion or updation
                    String name = scn.next(); // key
                    String phoneNo = scn.next(); // value
                    directory.put(name, phoneNo);
                    break;
                }

                case 2: {
                    // read operation
                    String name = scn.next();
                    String phoneNo = directory.getOrDefault(name, "-1");
                    System.out.println(phoneNo);
                    break;
                }

                case 3: {
                    // remove operation
                    String name = scn.next();
                    directory.remove(name);
                    break;
                }

                default: {
                    return;
                }
            }
        }
    }
}
