package programmers.level_0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AppearOneTime {

    // 한 번만 등장한 숫자
    // 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

    public String solution(String s) {
        return Arrays.stream(s.split("")).filter(item -> Arrays.stream(s.split("")).filter(element -> element.equals(item)).count() == 1).sorted().collect(Collectors.joining());
    }
}
