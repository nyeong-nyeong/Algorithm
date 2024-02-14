package programmers.level_zero;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiddleValue {

    // 중앙값 구하기
    // 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

    public int solution(int[] array) {
        int a = (int) Arrays.stream(array).count();
        List<Integer> asd = Arrays.stream(array).sorted().boxed().collect(Collectors.toList());
        a = (int)(a/2);
        return (asd.get(a));

//        Arrays.sort(array);
//        return array[array.length >> 1];
//        위와 같은 방법으로 하면 5를 할 경우에는 2 인덱스값으로 나타내면 중앙값이 나옴
    }
}
