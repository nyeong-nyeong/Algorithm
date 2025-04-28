package BOJ.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusBHyphenSeven {
    public static void main(String[] args) throws IOException {
        StringBuilder string = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            string.append("Case #").append(i + 1).append(": ").append(a + b).append("\n");
        }
        System.out.println(string);
    }
}
