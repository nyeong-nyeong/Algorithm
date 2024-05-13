package programmers.level_0;

public class ArrayAverage {

    // 배열의 평균값
    // 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

    public double solution(int[] numbers) {
        double sum = 0;
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double a  = sum/numbers.length * 10;
        int as = (int) a%10;
        answer =(double) a / 10;

        if(as == 0 || as == 5) {
            return answer;
        }
        return 0;
    }
}
