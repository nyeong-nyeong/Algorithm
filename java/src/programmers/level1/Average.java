package programmers.level1;

import java.util.Arrays;

public class Average {
    // 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
    public static double solution(int[] arr) {

//        return Arrays.stream(arr).asDoubleStream().average().orElse(0);

        // stream 으로 풀어서 제출 했는데 생각보다 너무 컴파일 속도가 느려서 ..  for 문으로 하니까 더 빠르게 컴파일 되는 모습을 볼 수 있었다

        if (arr.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        System.out.printf("check :: ");
        System.err.println(solution(new int[]{1, 4, 7, 8}));
    }
}
