package BOJ.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 행렬덧셈 {
    public static void main(String[] args) throws IOException {
        // 2738
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] a = new  int[n][m];
        int[][] b = new  int[n][m];

        for(int i=0; i<n; i++){
            String[] aa = br.readLine().split(" ");
            for(int j=0; j<aa.length; j++){
                a[i][j] = Integer.parseInt(aa[j]);
            }
        }

        for(int i=0; i<n; i++){
            String[] aa = br.readLine().split(" ");
            for(int j=0; j<aa.length; j++){
                b[i][j] = Integer.parseInt(aa[j]);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println(a[i][j]+b[i][j]);
            }
        }
    }
}
