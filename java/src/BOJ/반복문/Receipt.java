package BOJ.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25304
public class Receipt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int totalCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < totalCount; i++) {
            String[] input = br.readLine().split(" ");
            total -= Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
        }

        if (total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
