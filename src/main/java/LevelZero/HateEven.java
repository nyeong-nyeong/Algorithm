package LevelZero;

import java.util.ArrayList;
import java.util.List;

public class HateEven {

    // 짝수는 싫어요
    // 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int n) {

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            a.add(i);
        }
        return a.stream().filter(item -> item % 2 != 0).mapToInt(Integer::intValue).toArray();
    }
}
