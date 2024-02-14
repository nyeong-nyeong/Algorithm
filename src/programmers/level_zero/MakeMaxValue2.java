package programmers.level_zero;

public class MakeMaxValue2 {

    // 최댓값 만들기2
    // 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

    public Integer solution(int[] numbers) {
        Integer maxValue = -1000000000;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j != i) {
                    if (maxValue < numbers[i] * numbers[j]) {
                        maxValue = numbers[i] * numbers[j];
                    }
                }
            }
        }

    //        Arrays.sort(numbers);
    //        return numbers[numbers.length-1] * numbers[numbers.length-2] < numbers[0] * numbers[1] ?
    //                numbers[0] * numbers[1] : numbers[numbers.length-1] * numbers[numbers.length-2];
    // 일단 배열을 통해서 정렬을 하고 음수 자릿수 2개의 곱 , 양수 자릿수의 곱 두개를 통해서 비교한다

        return maxValue;
    }
}
