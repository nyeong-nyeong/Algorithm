package BOJ.DP;

import java.io.*;

public class 계단오르기2579 {
    static Integer dp[];
    static int array[];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        array = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = array[0];
        dp[1] = array[1];

        if(N >= 2) {
            dp[2] = array[1] + array[2];
        }

        System.out.println(findAndAdd(N));

    }

    static int findAndAdd(int n) throws IOException {

        if(dp[n] == null) {
            dp[n] = Math.max(findAndAdd(n-3) + array[n-1] , findAndAdd(n-2)) + array[n];
        }
        return dp[n];
    }
}
