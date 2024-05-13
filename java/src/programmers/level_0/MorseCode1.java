package programmers.level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCode1 {

    // 모스 부호 1
    // 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
    //모스부호는 다음과 같습니다.

    public String solution(String letter) {
        String morse =
                "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',"
                        + "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',"
                        + "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',"
                        + "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',"
                        + "'-.--':'y','--..':'z'";
        String[] aa = morse.replaceAll("'", "").replaceAll("':'", "").split(",");
        List<String> aa2 = Arrays.stream(aa).collect(Collectors.toList());
        Map<String, String> mosCode = new HashMap<String, String>();
        aa2.forEach(i -> {
            String a[] = i.split(":");
            mosCode.put(a[0], a[1]);
        });
        Arrays.stream(letter.split(" ")).map(i -> i = mosCode.get(i)).collect(Collectors.joining());

        return Arrays.stream(letter.split(" ")).map(i -> i = mosCode.get(i)).collect(Collectors.joining());
    }
}
