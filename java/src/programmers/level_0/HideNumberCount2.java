package programmers.level_0;

public class HideNumberCount2 {

    // 숨어있는 숫자의 덧셈 (2)
    // 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

    public  int solution(String my_string) {
        String[] num = my_string.replaceAll("[^0-9]", " ").split(" ");

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            System.err.println(num[i]);
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i].equals("")) {
                continue;
            } else {
                sum += Integer.parseInt(num[i].trim());
            }
        }
        return sum;
    }
}
