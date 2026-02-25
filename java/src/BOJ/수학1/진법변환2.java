package BOJ.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진법변환2 {
    public static void main(String[] args) throws IOException {
        // 11005
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while(N >0) {
            int a = N % B;
            if(a < 10) {
                sb.append(a);
            } else {
                sb.append((char) ('A' + a - 10));
            }
            N /= B;
        }
        System.out.println(sb.reverse());
    }
}
