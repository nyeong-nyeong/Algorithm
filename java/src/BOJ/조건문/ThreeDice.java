package BOJ.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2480
public class ThreeDice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if(a == c && b == c) {
            System.out.println(10000 + a * 1000);
        } else if(a == b || a == c || b == c) {
            int s = a == b ? a : (a == c ? a : b);
            System.out.println(1000 + s * 100);
        } else {
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
    }
}
