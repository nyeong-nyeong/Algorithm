package leetcode;

// 1480
public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] sumArr = new int[nums.length];
        sumArr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sumArr[i] = sumArr[i - 1] + nums[i];
        }
        return sumArr;
        // 간단하게 구현하면
//    for (int i = 1; i < nums.length; i++){
//        nums[i] = nums[i - 1] + nums[i];
//    }
//    return nums;
    }

}
