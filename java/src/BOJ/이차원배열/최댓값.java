package BOJ.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최댓값 {
    public static void main(String[] args) throws IOException {
        int max = 0;
        int x = 1;
        int y = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 1; i < 10; i ++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            for(int j = 1; j < 10; j ++) {
                int newInput = Integer.parseInt(st.nextToken());
                if(max <  newInput) {
                    max = newInput;
                    x =  i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", x, y);
    }
}
