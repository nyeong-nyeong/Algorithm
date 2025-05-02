package BOJ.문자와문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2908
public class BaboSangsu {
    public static void main(String[] args) {
        new BufferedReader(new InputStreamReader(System.in)).lines().forEach(line -> {
            String[] input = line.split(" ");
            StringBuilder sb1 = new StringBuilder(input[0]);
            StringBuilder sb2 = new StringBuilder(input[1]);
            int num1 = Integer.parseInt(sb1.reverse().toString());
            int num2 = Integer.parseInt(sb2.reverse().toString());
            System.out.println(Math.max(num1, num2));
        });
    }
}
