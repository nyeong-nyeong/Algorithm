package programmers.level_zero;

import java.util.Arrays;


public class CloseNumber {

    // 가까운 수
    // 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        array =  Arrays.stream(array).sorted().toArray();
        for (int i = 0; i < array.length; i++) {
            if(Math.abs(array[i]) - n == 0) {
                answer = array[i];
                return answer;
            }
            if(min > Math.abs(n - array[i])) {
                min = Math.abs(n - array[i]);
                answer = array[i];
            }
        }
        return answer;
    }

}
