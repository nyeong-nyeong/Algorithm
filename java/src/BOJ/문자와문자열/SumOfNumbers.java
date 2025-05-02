package BOJ.문자와문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11720
public class SumOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] s = br.readLine().split("");
        int sum = 0;
        for (String str : s) {
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);
    }
}
