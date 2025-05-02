package BOJ.문자와문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 11718
public class PrintAsIs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while (true) {
            line = br.readLine();
            if (line == null) {
                bw.flush();
                break;
            }
            bw.write(line);
            bw.newLine();
        }
    }
}
