package BOJ.문자와문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 27866
public class CharactersAndString {
    public static void main(StringLength[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int num  = Integer.parseInt(br.readLine());

        System.out.println(s.charAt(num - 1));
    }
}
