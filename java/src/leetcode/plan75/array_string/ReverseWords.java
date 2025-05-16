package leetcode.plan75.array_string;

public class ReverseWords {
    public static String solution(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; 0 <= i; i--) {
            sb.append(arr[i]).append(' ');
        }
        return String.valueOf(sb).trim();
    }
}
