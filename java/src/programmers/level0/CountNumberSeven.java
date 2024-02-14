package programmers.level_zero;

import java.util.Arrays;

public class CountNumberSeven {

    // 7의 개수
    // 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

    public int solution(int[] array) {
        return Arrays.stream(array).map(item ->
                item = (int) Arrays.stream(String.valueOf(item).split("")).filter(element ->
                        element.equals("7")
                ).count()
        ).sum();
    }
}
