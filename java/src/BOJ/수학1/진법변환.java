package BOJ.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진법변환 {
    public static void main(String[] args) throws IOException {
        // 2745

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int value;
            if(c >= 'A' && c <= 'Z') {
                value = c - 'A' + 10;
            } else {
                value = c - '0';
            }
            result = result * B + value;
        }
        System.out.println(result);
    }
}
