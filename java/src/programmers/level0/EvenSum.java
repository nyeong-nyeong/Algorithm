package programmers.level0;

public class EvenSum {

    // 짝수의 합
    // 정수 n이 주어질 때,n 이하의 짝수를 더한 값을 return 하도록 solution 함수를 작성해주세요.

    public int solution(int n) {
        int answer = 0;
        while(n != 0) {
            if(n%2 == 0) {
                answer = answer + n;
            }
            n = n-1 ;
        }
        return answer;
    }
}
