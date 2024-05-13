package programmers.level_0;

public class DiscountStore {
    public int solution(int price) {

        // 옷가게 할인 받기
        // 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
        // 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.

        int answer = 0;
        answer = (int) (price >= 500000 ? price * 0.8 : price >= 300000 ? price * 0.9 : price >= 100000 ? price * 0.95 : price);
        return answer;
    }
}
