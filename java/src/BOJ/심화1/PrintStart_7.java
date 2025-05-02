package BOJ.심화1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2444
public class PrintStart_7 {
    public static void main(String[] args) {
        new BufferedReader(new InputStreamReader(System.in)).lines().forEach(line -> {
            int n = Integer.parseInt(line);
            for (int i = 1; i <= n; i++) {
                System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
            }
            for (int i = n - 1; i >= 1; i--) {
                System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
            }
        });
    }
}
