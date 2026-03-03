package BOJ.약수와배수와소수1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배수와약수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s1 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());

            if(s1==s2 && s1 == 0){
                break;
            } else if(s1== 0 || s2 == 0){
                System.out.println("neither");
            }

            if(s1%s2 == 0) {
                System.out.println("multiple");
            } else if(s2%s1 == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}
