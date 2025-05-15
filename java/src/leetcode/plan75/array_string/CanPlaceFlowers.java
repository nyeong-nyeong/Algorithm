package leetcode.plan75.array_string;

public class CanPlaceFlowers {
    public boolean solution(int[] flowerbed, int n) {
        int putCount = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                boolean left = i == 0 || flowerbed[i - 1] == 0;
                boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;

                if(left && right) {
                    putCount++;
                    flowerbed[i] = 1;
                }
            }
        }
        return putCount >= n;
    }
}
