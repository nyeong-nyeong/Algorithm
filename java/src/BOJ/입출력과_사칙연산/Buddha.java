package BOJ.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//18108
public class Buddha {
    public static void main(String[] args) {
        new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .mapToInt(Integer::parseInt)
                .map(i -> i - 543)
                .forEach(System.out::println);
    }
}
