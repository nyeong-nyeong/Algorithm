package BOJ.약수와배수와소수1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수구하기 {
    public static void main(String[] args) throws IOException {

        // 2501
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int a = 0;

        for(int i=1; i<N+1; i++){
            if(N%i==0){
                a++;
                if(a == K) {
                    System.out.println(a);
                    break;
                }
            }
        }
        if(a != K) System.out.println("0");
    }
}
