package leetcode.plan75.two_pointer;

import java.util.HashMap;

public class MaxOperations {
    public int solution(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int result = k - num;
            if (map.getOrDefault(result, 0) > 0) {
                count++;
                map.put(result, map.getOrDefault(result, 0) - 1);
            } else map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

}
