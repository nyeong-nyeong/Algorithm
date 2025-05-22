package leetcode.plan75.array_string;

public class Compress {
    public int solution(char[] chars) {
        int result = 0;
        for (int i = 0; i < chars.length; ) {
            char c = chars[i];
            int count = 0;
            while (i < chars.length && c == chars[i]) {
                count++;
                i++;
            }
            chars[result++] = c;
            if (count > 1) {
                for (char cc : String.valueOf(count).toCharArray()) {
                    chars[result++] = cc;
                }
            }
        }
        return result;
    }
}
