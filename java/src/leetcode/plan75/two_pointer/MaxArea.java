package leetcode.plan75.two_pointer;

public class MaxArea {
    public int solution(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int a = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(a, result);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
