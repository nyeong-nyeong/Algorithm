package BOJ.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

//2525
public class OvenClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String input2 = br.readLine();
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int t = Integer.parseInt(input2);
        LocalTime localTime = LocalTime.of(h, m).plusMinutes(t);
        System.out.println(localTime.getHour() + " " + localTime.getMinute());
    }
}
