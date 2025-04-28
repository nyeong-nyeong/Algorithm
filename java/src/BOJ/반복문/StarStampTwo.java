package BOJ.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarStampTwo {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i <= count; i++) {
            sb.append(" ".repeat(count - i)).append("*".repeat(i)).append("\n");
        }

        System.out.println(sb);
    }
}
