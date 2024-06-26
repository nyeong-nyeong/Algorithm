package programmers.level_0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PickMultiple {

    // n의 배수 고르기
    // 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int n, int[] numlist) {
        List<Integer> list = Arrays.stream(numlist).filter(item -> item%n == 0).boxed().collect(Collectors.toList());
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
