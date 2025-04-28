package BOJ.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingPhysicalEducation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int e = Integer.parseInt(br.readLine());

        StringBuilder sum = new StringBuilder();

        for (int i = 4; i < e; i += 4) {
            if (i == 4) {
                sum.append("long");
            } else {
                sum.append(" long");
            }
        }

        System.out.println(sum.length() == 0 ? "long int" : sum + " long int");
    }
}
