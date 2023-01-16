package LevelZero;

public class AddDigits {
    public int solution(int n) {
        String[] a = String.valueOf(n).split("");
        int answer = 0;
        for (String str : a) {
            answer += Integer.valueOf(str);
        }
        return answer;
        //  return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
