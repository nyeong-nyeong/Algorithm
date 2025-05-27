package leetcode.plan75.hash_map_set;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CloseStrings {
    public boolean solution(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (!map1.keySet().equals(map2.keySet())) return false;

        List<Integer> list1 = map1.values().stream().sorted().collect(Collectors.toList());
        List<Integer> list2 = map2.values().stream().sorted().collect(Collectors.toList());

        return list1.equals(list2);
    }
}
