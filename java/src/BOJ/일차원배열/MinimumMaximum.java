package BOJ.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10818
public class MinimumMaximum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println(min + " " + max);
    }
}
