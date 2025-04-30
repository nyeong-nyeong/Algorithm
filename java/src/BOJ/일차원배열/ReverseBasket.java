package BOJ.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 10811
public class ReverseBasket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        List<Integer> basket = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            basket.add(i);
        }
        for (int i = 0; i < M; i++) {
            s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            List<Integer> subList = basket.subList(a - 1, b);
            Collections.reverse(subList);
        }

        for (int i = 0; i < N; i++) {
            sb.append(basket.get(i));
            if (i != N - 1) sb.append(" ");
        }

        System.out.println(sb);
    }
}
