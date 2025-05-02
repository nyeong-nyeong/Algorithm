package BOJ.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean[] arr = new boolean[26];
            char prev = 0;
            boolean isGroup = true;

            for (char c : s.toCharArray()) {
                if (c != prev) {
                    if (arr[c - 'a']) {
                        isGroup = false;
                        break;
                    }
                    arr[c - 'a'] = true;
                }
                prev = c;
            }

            if (isGroup) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
