package LevelZero;

import java.util.stream.IntStream;

public class FindDivisor {

    // 약수 구하기
    // 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int n) {

        return (int[]) IntStream.rangeClosed(1, n).sorted().filter(item -> n % item == 0).toArray();
    }

}
