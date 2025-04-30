package BOJ.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 5597
public class Assignment {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] students = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int studentNumber = Integer.parseInt(br.readLine());
            students[studentNumber] = true;
        }

        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MAX_VALUE;
        for (int i = 1; i <= 30; i++) {
            if (!students[i]) {
                if (num1 == Integer.MIN_VALUE) {
                    num1 = i;
                } else {
                    num2 = i;
                }
            }
        }
        System.out.println(Math.min(num2, num1));
        System.out.println(Math.max(num2, num1));
    }
}
