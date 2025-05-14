package leetcode.HashTable;

public class CountKDifference {
    public int solution(int[] nums, int k) {
        int[] arr = new int[101 + k];
        int pairCount = 0;
        for (int num : nums) {
            arr[num]++;
        }

        for (int num : nums) {
            pairCount += arr[num + k];
        }
        return pairCount;
    }
}
