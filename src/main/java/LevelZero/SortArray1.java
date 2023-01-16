package LevelZero;

import java.util.Arrays;

public class SortArray1 {

    // 문자열 정렬 하기
    // 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

    public int[] solution(String my_string) {

        return Arrays.stream(my_string.replaceAll("[^0-9]", "").split("")).mapToInt(Integer::valueOf).sorted().toArray();
        // replaceAll("[A-Z|a-z]" , "") 이렇게도 나타낼수 있음
    }
}
