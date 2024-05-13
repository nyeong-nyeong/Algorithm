package programmers.level_0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RockPaperScissors {

    // 가위바위보
    // 가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
    public String solution(String rsp) {
        String[] a = rsp.split("");
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("0")) {
                a[i] = "5";
            } else if (a[i].equals("2")) {
                a[i] = "0";
            } else if (a[i].equals("5")) {
                a[i] = "2";
            }
        }
     Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
    // 이런식으로 간단하게 표기가 가능하다 stream...
        return String.join("", a);
    }
}
