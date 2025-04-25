package BOJ.입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//10998
public class AmultiplyB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");

        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);

        System.out.println(a * b);
    }
}
