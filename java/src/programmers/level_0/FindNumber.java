package programmers.level_0;

import java.util.Arrays;

public class FindNumber {

    // 숫자 찾기
    // 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

    public int solution(int num, int k) {
        int answer = -1;
        int[] a = Arrays.stream(String.valueOf(num).split("")).mapToInt(item -> item.equals(String.valueOf(k)) ? -1 : Integer.valueOf(item)).toArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                return i + 1;
            }
        }
        return answer;
//        return ("-" + num).indexOf(String.valueOf(k));
//        이건 진짜 감탄이 나오는 방법이였는데 애초에 리턴값이 int 형이여서 인트로 반환해줘야하는데 indexOf 메서드를 이용해서 쓰려면 int형은 쓸수 없기 때문에 '-'를 붙여서 String으로 타입을 바꿔주고 저절로 반환값이 0부터 시작하는것을 1로 바꿔줄수
//        있었음 indexOf 메서드에 찾을수 없는 string 문자가 들어가면 return 값은 자연스럽게 -1이니까 아주 감탄이 나왔다
    }
}
