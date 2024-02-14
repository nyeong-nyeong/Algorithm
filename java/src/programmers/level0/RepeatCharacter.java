package programmers.level_zero;

import java.util.ArrayList;
import java.util.List;

public class RepeatCharacter {

    // 문자 반복 출력하기
    // 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

    public String solution(String my_string, int n) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            String a = my_string.substring(i, i + 1);
            for (int j = 0; j < n; j++) {
                list.add(a);
            }
        }

        return String.join("", list);
    }
}
