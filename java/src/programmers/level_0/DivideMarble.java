package programmers.level_0;

public class DivideMarble {

    public static void main(String[] args) {
        first();
    }

    // https://copro505.tistory.com/entry/%EA%B5%AC%EC%8A%AC%EC%9D%84-%EB%82%98%EB%88%84%EB%8A%94-%EA%B2%BD%EC%9A%B0%EC%9D%98-%EC%88%98
    // call stack의 원리에 대해서 알아야 함

    public static void first() {
        second();
        System.out.println("첫번째 호출");

    }

    public static void second() {
        third();
        System.out.println("두번째 호출");
    }

    public static void third() {
        System.out.println("세번째 호출");
    }

    // 구슬을 나누는 경우의 수
    //머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
    public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
}
