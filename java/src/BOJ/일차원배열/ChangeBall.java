package BOJ.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10813
public class ChangeBall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0])-1;
            int b = Integer.parseInt(input[1])-1;
            int temp = basket[a];
            basket[a] = basket[b];
            basket[b] = temp;
        }

        for (int i = 0; i < N; i++) {
            sb.append(basket[i]);
            if (i != N - 1) sb.append(" ");
        }
        System.out.println(sb);
    }
}
