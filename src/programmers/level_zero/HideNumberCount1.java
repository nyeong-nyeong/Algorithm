package programmers.level_zero;

public class HideNumberCount1 {

    // 숨어있는 숫자의 덧셈
    // 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

    public int solution(String my_string) {

        int answer = 0;
        my_string = my_string.replaceAll("[^123456789]", "");
        for (int i = 0; i < my_string.length(); i++) {
            answer = answer + Integer.parseInt(my_string.substring(i, i + 1));
        }
        return answer;

        //  return myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();

        // myString.chars().mapToObj(i -> (char) i)
        // IntStream에서 lambda 통해 객체에 매핑 i -> (char)i하면 자동으로 상자에 상자를 넣은 Stream<Character>을 통해 stream 쓸 수 있음
    }
}
