package leetcode.plan75.hash_map_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDifference {
    public List<List<Integer>> solution(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toCollection(HashSet::new));

        HashSet<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toCollection(HashSet::new));

        return Arrays.asList(diff(set1, set2), diff(set2, set1));
    }

    private List<Integer> diff(HashSet<Integer> a, HashSet<Integer> b) {
        return a.stream().filter(num -> !b.contains(num)).collect(Collectors.toList());
    }

}
