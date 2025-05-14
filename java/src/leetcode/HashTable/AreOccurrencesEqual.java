package leetcode.HashTable;

import java.util.*;

public class AreOccurrencesEqual {
    public boolean solution(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        Set<Integer> set = new HashSet<>(map.values());
//        return set.size() == 1;
        char[] arr = new char[26];
        for(char c : s.toCharArray()) arr[c - 'a']++;
        for(char c : arr) if(c != 0 && arr[s.charAt(0) - 'a'] != c) return false;
        return true;
    }
}
