package leetcode;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int count = 0;
        int length = arr.length;
        while (count + 1 < length && arr[count] < arr[count + 1]) {
            count++;
        }

        if (count == 0 || arr[count] == arr[length - 1]) return false;

        while (count + 1 < length && arr[count] > arr[count + 1]) {
            count++;
        }

        return count == length - 1;
    }
}
