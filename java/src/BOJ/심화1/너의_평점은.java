package BOJ.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class 너의_평점은 {
    public static void main(String[] args) throws IOException {
        // 25206
        /*
         * map으로 각 알파벳에 맞는 배점을 찾아서 (알파벳) key , value에 값
         * 배열 split으로 3개로 0번째 필요없음 2번 째 * 3번째 key로 value값 get 해서 곱하기
         * 2번 째는 변수에 값 저장
         * P인 경우는 계산 넘김 로직 첫 번째에 넣어줌
         * F 같은 경우는 0점
         */
        Map<String, Double> GPAmap =  Map.of(
                "A+", 4.5,
                "A0" , 4.0,
                "B+", 3.5,
                "B0", 3.0,
                "C+", 2.5,
                "C0", 2.0,
                "D+", 1.5,
                "D0", 1.0,
                "F", 0.0
        );

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        double result = 0;
        double totalCredit = 0;
        while ((line = br.readLine()) != null) {
            String[] subjectScoreInfo =  line.split(" ");
            // 배점
            double score = Double.parseDouble(subjectScoreInfo[1]);
            // 등급
            String grade = subjectScoreInfo[2];
            if("P".equals(grade)) {
                continue;
            }
            result += score * GPAmap.get(grade);
            totalCredit += score;
        }
        System.out.println(result/ totalCredit);
    }
}
