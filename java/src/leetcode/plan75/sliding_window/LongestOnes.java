package leetcode.plan75.sliding_window;

public class LongestOnes {
    public int solution(int[] nums, int k) {
        int left = 0, longest = 0;
        int zeros = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            while (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}