package BOJ.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

//	2884
public class AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        LocalTime time = LocalTime.of(h,m);
        LocalTime localTime = time.minusMinutes(45);
        System.out.println(localTime.getHour()+" "+localTime.getMinute());
    }
}
