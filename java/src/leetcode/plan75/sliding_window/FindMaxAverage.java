package leetcode.plan75.sliding_window;

public class FindMaxAverage {
    public double solution(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < nums.length; i++) {
            max += nums[i] - nums[i - k];
            sum = Math.max(max, sum);
        }

        return (double) sum / k;
    }
}
