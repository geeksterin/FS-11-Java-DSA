package Day09;
public class _50PrintAlphabetsI {
    public static void main(String[] args) {
        // Approach 1
        // for (int idx = 1; idx <= 26; idx++) {
        // char ch = (char) (idx + 96);
        // System.out.println(ch);
        // }

        // for (int idx = 0; idx <= 25; idx++) {
        // char ch = (char) (idx + 97);
        // System.out.println(ch);
        // }

        // for (int idx = 97; idx <= 122; idx++) {
        // char ch = (char) (idx);
        // System.out.println(ch);
        // }

        // Approach 2
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }
}
