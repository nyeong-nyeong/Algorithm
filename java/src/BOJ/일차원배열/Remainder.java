package BOJ.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 3052
public class Remainder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int remainder = num % 42;
            unique.add(remainder);
        }

        System.out.println(unique.size());
    }
}
