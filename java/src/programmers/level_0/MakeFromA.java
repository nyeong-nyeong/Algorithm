package programmers.level_0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MakeFromA {

    // A로 B 만들기
    // 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

    public static int solution(String before, String after) {

        String beforeStr = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String afterStr = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());

        return beforeStr.equals(afterStr) ? 1 : 0 ;

    }
}
