package leetcode.plan75.stack;

import java.util.Stack;

public class DecodeString {
    public String solution(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> sStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == ']') {
                int k = countStack.pop();
                StringBuilder current = sb;
                sb = sStack.pop();

                while (k-- > 0) {
                    sb.append(current);
                }

            } else if (c == '[') {
                countStack.push(n);
                n = 0;
                sStack.push(sb);
                sb = new StringBuilder();

            } else sb.append(c);
        }
        return sb.toString();
    }
}
