package BOJ.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10988
public class CheckPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        boolean bool = true;

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                bool = false;
                break;
            }
        }

        System.out.println(bool ? 1 : 0);
    }
}
