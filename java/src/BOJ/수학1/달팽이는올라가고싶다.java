package BOJ.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException {

        // 2869
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new  StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

//        // 시간 초과
//        int day =  0;
//        int total = 0;
//        while (total < V) {
//            if(total != 0) total -= B;
//            total += A;
//            day++;
//        }
//        System.out.println(day);
        System.out.println(((V - B - 1) / (A - B)) + 1);
    }
}
