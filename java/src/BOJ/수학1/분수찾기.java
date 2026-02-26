package BOJ.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {
    public static void main(String[] args) throws IOException {
        // 1193

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int line = 1;

        while (line < X) {
            X -= line;
            line++;
        }
        if(line%2 == 0) {
            System.out.println(X + "/" + (line - X + 1));
        } else System.out.println((line - X + 1) +"/" + X);
    }
}
