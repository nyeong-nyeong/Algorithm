package BOJ.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세탁소사장동혁 {
    public static void main(String[] args) throws IOException {
        // 2720

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

            while(loop-- > 0) {
                int money = Integer.parseInt(br.readLine());
                int quarter = money/25;
                money = money%25;

                int dime = money/10;
                money = money%10;

                int nickel = money/5;
                money = money%5;

                int penny = money;

                StringBuilder sb = new StringBuilder();

                System.out.println(sb.append(quarter).append(" ")
                        .append(dime).append(" ")
                        .append(nickel).append(" ")
                        .append(penny));
        }
    }
}
