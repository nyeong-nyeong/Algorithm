package BOJ.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatianAlphabet {
    static String[] croatia = {
            "c=",
            "c-",
            "dz=",
            "d-",
            "lj",
            "nj",
            "s=",
            "z=",
    };
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0;

        for (String cr : croatia) {
            while (input.contains(cr)) {
                input = input.replaceFirst(cr, " ");
                count++;
            }
        }

        System.out.println(input.replaceAll(" ", "").length() + count);
    }
}
