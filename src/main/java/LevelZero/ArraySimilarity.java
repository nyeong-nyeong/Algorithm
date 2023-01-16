package LevelZero;

import java.util.Arrays;

public class ArraySimilarity {
    public int solution(String[] s1, String[] s2) {
        int answer = (int)Arrays.asList(s1).stream().filter( item -> Arrays.asList(s2).contains(s1)).count();
        return answer;
    }
}
