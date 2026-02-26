package BOJ.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());

        if(target == 1){
            System.out.println(1);
            return;
        }
        int count = 1;
        int result = 1;
        while(result < target){
            result = result + (count * 6);
            count ++;
        }
        System.out.println(count);
    }
}
