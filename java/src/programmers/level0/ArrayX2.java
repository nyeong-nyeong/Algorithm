package programmers.level0;

public class ArrayX2 {
    public int[] solution(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        return numbers;
    }
}
