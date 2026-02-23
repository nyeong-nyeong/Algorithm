package BOJ.이차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class 색종이 {
    public static void main(String[] args) throws IOException {
        // 2563
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] totalBox = new boolean[101][101];
        int total = 0;

        for(int i=0;i<n;i++) {
            StringTokenizer xy = new StringTokenizer(br.readLine());
            int x =  Integer.parseInt(xy.nextToken());
            int y = Integer.parseInt(xy.nextToken());
            for(int j=x; j<x + 10; j++) {
                for(int k=y; k<y + 10; k++) {
                    if(!totalBox[j][k]) {
                        totalBox[j][k] = true;
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}
