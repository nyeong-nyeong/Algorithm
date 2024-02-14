package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;


public class UpperLowerCase {

    // 대문자와 소문자
    // 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).map(item -> Character.isUpperCase(item.charAt(0)) ? item.toLowerCase() : Character.isLowerCase(item.charAt(0)) ? item.toUpperCase() : item).collect(Collectors.joining());
    }
}
