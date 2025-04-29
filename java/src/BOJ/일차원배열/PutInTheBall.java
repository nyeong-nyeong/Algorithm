package BOJ.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PutInTheBall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] basket = new int[N];

        for (int m = 0; m < M; m++) {
            input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);

            for (int x = i - 1; x < j; x++) {
                basket[x] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(basket[i]);
            if (i != N - 1) sb.append(" ");
        }
        System.out.println(sb);
    }
}