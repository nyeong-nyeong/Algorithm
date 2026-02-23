package BOJ.이차원배열;

import java.io.*;

public class 세로읽기 {
    public static void main(String[] args) throws IOException {
        // 10798
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String[] arr = new String[5];
        for(int i=0;i<5;i++) {
            arr[i] = br.readLine();
        }

        for(int i=0;i<15;i++) {
            for(int j=0;j<5;j++) {
                if(arr[j].length() > i) {
                    sb.append(arr[j].charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
