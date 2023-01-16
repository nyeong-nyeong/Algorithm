package LevelZero;

public class SliceArray {

    // 배열 자르기
    // 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] asdasd = new int[num2-num1+1];
        int a = num1;
        for (int i = 0; i < asdasd.length; i++) {

            asdasd[i] = numbers[a];
            a++;
            System.err.println(asdasd[i]);
        }
        return asdasd;
        // return Arrays.copyOfRange(numbers, num1, num2 + 1);
        //                          받을 배열 , 시작 인덱스 , 끝나는 인덱스 전 까지 -> +1 로 parameter 포함 하기
    }

}
