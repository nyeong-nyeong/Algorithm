package BOJ.문자와문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1152
public class NumberOfWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (!input[i].isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
