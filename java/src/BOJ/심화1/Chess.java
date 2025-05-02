package BOJ.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 3003
public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length; i++) {
            int num = Integer.parseInt(s[i]);
            if (i == 0) {
                sb.append(1 - num).append(" ");
            } else if (i == 1) {
                sb.append(1 - num).append(" ");
            } else if (i == 2) {
                sb.append(2 - num).append(" ");
            } else if (i == 3) {
                sb.append(2 - num).append(" ");
            } else if (i == 4) {
                sb.append(2 - num).append(" ");
            } else if (i == 5) {
                sb.append(8 - num);
            }
        }

        System.out.println(sb);
    }
}
