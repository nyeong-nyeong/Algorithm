package programmers.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ExoPlanetAge {

    // 외계행성의 나이
    // 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.

    public String solution(int age) {
        String[] messek = String.valueOf(age).split("");

        for (int i = 0; i < messek.length; i++) {
            if(messek[i].equals("0")) {
                messek[i] = "a";
            }else if(messek[i].equals("1")) {
                messek[i] = "b";
            }else if(messek[i].equals("2")) {
                messek[i] = "c";
            }else if(messek[i].equals("3")) {
                messek[i] = "d";
            }else if(messek[i].equals("4")) {
                messek[i] = "e";
            }else if(messek[i].equals("5")) {
                messek[i] = "f";
            }else if(messek[i].equals("6")) {
                messek[i] = "g";
            }else if(messek[i].equals("7")) {
                messek[i] = "h";
            }else if(messek[i].equals("8")) {
                messek[i] = "i";
            }else if(messek[i].equals("9")) {
                messek[i] = "j";
            }
        }
        return Arrays.stream(messek).map(String::valueOf).collect(Collectors.joining());
//        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
}
