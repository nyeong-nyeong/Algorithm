package leetcode.plan75.sliding_window;

public class MaxVowels {
    public int solution(String s, int k) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += findVowel(chars[i]);
        }
        int max = sum;
        for (int i = k; i < chars.length; i++) {
            sum += findVowel(chars[i]) + findVowel(chars[i - k]);
            max = Math.max(sum, max);
        }
        return max;
    }

    public static int findVowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return 1;
        } else return 0;
    }
}
