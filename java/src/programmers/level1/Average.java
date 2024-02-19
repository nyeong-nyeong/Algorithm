package programmers.level1;

import java.util.Arrays;

public class Average {
    // 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
    public static double solution(int[] arr) {

        return Arrays.stream(arr).asDoubleStream().average().orElse(0);
    }

    public static void main(String[] args) {
        System.out.printf("check :: ");
        System.err.println(solution(new int[]{1, 4, 7, 8}));
    }
}
