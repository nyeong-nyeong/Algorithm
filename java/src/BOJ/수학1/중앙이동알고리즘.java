package BOJ.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 중앙이동알고리즘 {
    public static void main(String[] args) throws IOException {
        // 2903

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dot = 1 << N + 1;
        System.out.println(dot * dot);
    }
}
