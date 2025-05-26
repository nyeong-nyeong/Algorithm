package leetcode.plan75.prefix_sum;

public class LargestAltitude {
    public int solution(int[] gain) {
        int largest = 0, sum = 0;
        for (int j : gain) {
            sum += j;
            largest = Math.max(sum, largest);
        }
        return largest;
    }
}
