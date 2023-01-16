package LevelZero;

public class SumOfFraction {

    // 분수의 덧셈
    // 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        public int[] solution(int denum1, int num1, int denum2, int num2) {

            int a = denum1*num2+denum2*num1;
            int b = num1*num2;
            int aa = gcd(a, b);
            int[] answer = {a/aa , b/aa};
            return answer;
        }
        static int gcd(int a, int b){
            while(b!=0){
                int r = a%b;
                a= b;
                b= r;
            }
            return a;
        }
}
