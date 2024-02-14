package programmers.level0;

public class EvenOdd {
    public int[] solution(int[] num_list) {

        // 짝수 홀수 갯수
        // 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        int even = 0;
        int odd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                odd++;
            } else {
                even++;
            }
        }
        int[] answer = {even , odd};
        return answer;

        // 다른 사람 풀이를 보면서 너무 생각하는게 신기하고 대단해서 코드를 좀 가지고 왔음

//        int[] anotherAnswer = new int[2];
//
//        for(int i = 0; i < num_list.length; i++)
//            anotherAnswer[num_list[i] % 2]++;
//
//        return anotherAnswer;
    }
}
