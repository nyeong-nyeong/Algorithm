package leetcode;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int start = i + 1;
                shift(arr, start);
                i++;
            }
        }
    }

    static void shift(int[] arr, int start) {
        for (int i = arr.length - 1; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        if (start < arr.length) {
            arr[start] = 0;
        }
    }
}
