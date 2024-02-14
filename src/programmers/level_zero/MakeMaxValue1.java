package programmers.level_zero;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeMaxValue1 {

    // 최댓값 만들기 1
    // 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

    public int solution(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());

        int[] result = list.stream().mapToInt(Integer::valueOf).toArray();

        return result[result.length - 2] * result[result.length - 1];
    }
}
