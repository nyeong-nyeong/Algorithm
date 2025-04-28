package BOJ.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//	10950
public class APlusBHyphenThree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i] = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
