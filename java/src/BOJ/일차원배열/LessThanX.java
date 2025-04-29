package BOJ.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 10871
public class LessThanX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        int target = Integer.parseInt(s[1]);

        Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt)
                .filter(i -> i < target)
                .forEach(i -> sb.append(i).append(" "));

        System.out.println(sb.toString().trim());
    }
}
