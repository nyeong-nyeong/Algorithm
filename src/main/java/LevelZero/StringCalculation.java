package LevelZero;

public class StringCalculation {

    // 문자열 계산하기
    //my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.

    public int solution(String my_string) {

        String[] num = my_string.split(" ");
        int first = Integer.parseInt(num[0]);
        for (int i = 0; i < num.length; i++) {
            if (i % 2 != 0) {
                if (num[i].equals("+")) {
                    first += Integer.parseInt(num[i + 1]);
                } else {
                    first -= Integer.parseInt(num[i + 1]);
                }
            }
        }
        return first;
        //    public int solution(String myString) {
        //        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("\\+ ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
        //    }
        // 아예 값으로 만들어 버려서 한번에 stream 으로  음수 양수로 만들고 sum 으로 한번에 더해주는 로직
    }

}
