package leetcode.plan75.stack;

public class RemovingStarsFromAString {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*' && sb.length() > 0) {
                sb.deleteCharAt(s.length() - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
