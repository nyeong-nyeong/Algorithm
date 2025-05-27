package leetcode.plan75.hash_map_set;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueOccurrences {
    public boolean solution(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> distinct = map.values().stream().distinct().collect(Collectors.toList());

        return map.size() == distinct.size();
    }

}
