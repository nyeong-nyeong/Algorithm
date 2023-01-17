package LevelZero;

import java.util.Arrays;

public class ArraySimilarity {

    // 배열의 유사도
    // 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
    public int solution(String[] s1, String[] s2) {
        int answer = (int) Arrays.asList(s1).stream().filter(item -> Arrays.asList(s2).contains(s1)).count();
        return answer;
    }
}
