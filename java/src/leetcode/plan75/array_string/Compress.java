package leetcode.plan75.array_string;

public class Compress {
    public int solution(char[] chars) {
        int[] arr = new int[26];
        for (char c : chars) {
            arr[c]++;
        }
        int count = 0;
        for (int a : arr) {
            if (a != 0) count++;
        }
        return count;
    }
}
