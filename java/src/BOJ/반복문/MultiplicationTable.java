package BOJ.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2739
public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .mapToInt(Integer::parseInt)
                .forEach(e -> {
                    for (int i = 1; i <= 9; i++) {
                        System.out.println(e + " * " + i + " = " + (e * i));
                    }
                });
    }
}
