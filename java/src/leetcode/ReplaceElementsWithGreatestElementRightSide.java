package leetcode;

public class ReplaceElementsWithGreatestElementRightSide {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int greatest = arr[length - 1];
        arr[length - 1] = -1;
        for (int i = length - 2; i >= 0; i--) {
            arr[i] = greatest;
            int current = arr[i];
            if (current > greatest) {
                greatest = current;
            }

        }

        return arr;
    }
}
