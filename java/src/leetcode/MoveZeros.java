package leetcode;

public class MoveZeros {
    public void solution(int[] nums) {
        int insertIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        while (insertIndex < nums.length) {
            nums[insertIndex] = 0;
            insertIndex++;
        }
    }
}
