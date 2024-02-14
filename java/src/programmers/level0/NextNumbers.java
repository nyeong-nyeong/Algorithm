package programmers.level0;

public class NextNumbers {

    // 다음에 올 숫자 ;
    // 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

    public int solution(int[] common) {
        int answer = 0;

        if ((common[1] - common[0]) == (common[2] - common[1])) {
            // 등차와 등비 두개의 조건으로 들어오기 때문에 구분하긱 쉬운 등차 수열을 확인한다 3개 이상의 숫자가 있다고 가정했을 때
            // 가운데를 기준으로 앞뒤의 차를 통해 나온값이 같은지 확인해서 등차수열인지 아닌지 확인한다.
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }

}
