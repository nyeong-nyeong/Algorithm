package BOJ.문자와문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

// 10809
public class FindAlphabet {
    static List<String> ss = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        ss.forEach(s -> sb.append(findIndex(S, s)).append(" "));
        System.out.println(sb);
    }

    static int findIndex(String[] S, String s) {
        for (int i = 0; i < S.length; i++) {
            if (S[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }
}
