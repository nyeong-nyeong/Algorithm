package leetcode.plan75.stack;

import java.util.Arrays;

public class AsteroidCollision {
    public int[] solution(int[] asteroids) {
        int top = -1;
        int[] arr = new int[asteroids.length];

        for (int asteroid : asteroids) {
            boolean alive = true;

            while (top >= 0 && asteroid < 0 && arr[top] > 0) {
                if (arr[top] < -asteroid) {
                    top--;
                } else if (arr[top] == -asteroid) {
                    top--;
                    alive = false;
                    break;
                } else {
                    alive = false;
                    break;
                }
            }

            if (alive) {
                arr[++top] = asteroid;
            }
        }

        return Arrays.copyOfRange(arr, 0, top + 1);
    }
}
