package leetcode.plan75.hash_map_set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualPairs {
    public int solution(int[][] grid) {
        int sum = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int[] g : grid) {
            String key = Arrays.toString(g);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < grid.length; i++) {
            int[] a = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                a[j] = grid[j][i];
            }
            String key = Arrays.toString(a);
            sum += map.getOrDefault(key, 0);
        }

        return sum;
    }
}
