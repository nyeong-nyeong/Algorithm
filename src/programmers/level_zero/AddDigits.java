package programmers.level_zero;

public class AddDigits {
    public int solution(int n) {

        // 자릿수 더하기
        //정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

        String[] a = String.valueOf(n).split("");
        int answer = 0;
        for (String str : a) {
            answer += Integer.valueOf(str);
        }
        return answer;
        //  return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
