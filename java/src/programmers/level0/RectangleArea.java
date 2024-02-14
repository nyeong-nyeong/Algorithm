package programmers.level0;

import java.util.Arrays;

public class RectangleArea {

    // 직사각형 넓이 구하기
    // 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.

    public int solution(int[][] dots) {

        Arrays.sort(dots , (o1 , o2) -> {
            if(o1[0] == o2[0]){
                return Integer.compare(o1[1] , o2[1]);
            } else {
                return Integer.compare(o1[0] , o2[0]);
            }
        });

        return Math.abs(dots[0][0] - dots[2][0]) * Math.abs((dots[0][1]-dots[1][1]));
    }

}
