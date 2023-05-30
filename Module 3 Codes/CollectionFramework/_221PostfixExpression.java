package CollectionFramework;

import java.util.*;

public class _221PostfixExpression {
    public static int postfixEvaluation(String str) {
        Stack<Integer> stk = new Stack<>();

        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);

            switch (ch) {
                case '+': {
                    int b = stk.pop();
                    int a = stk.pop();
                    stk.push(a + b);
                    break;
                }
                case '-': {
                    int b = stk.pop();
                    int a = stk.pop();
                    stk.push(a - b);
                    break;
                }
                case '/': {
                    int b = stk.pop();
                    int a = stk.pop();
                    stk.push(a / b);
                    break;
                }
                case '*': {
                    int b = stk.pop();
                    int a = stk.pop();
                    stk.push(a * b);
                    break;
                }
                default: {
                    // digits: '0' to '9'
                    stk.push(ch - '0');
                }
            }
        }

        return stk.pop();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(postfixEvaluation(str));
        scn.close();
    }
}
