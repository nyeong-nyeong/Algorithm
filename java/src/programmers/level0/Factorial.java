package programmers.level0;

public class Factorial {

    // 팩토리얼
    // i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.

    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i <= 10; i++) {
            if (factorial(i) <= n) {
                answer = i;
            }
        }
        return answer;
    }

    public int factorial(int a) {
        if (a <= 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }

    }

//    int fac = 1;
//    int i = 0;
//
//        while(true){
//        if(fac <= n){
//            fac *= i + 1;
//            i++;
//        }else break;
//    }
//
//        return i-1;
}
