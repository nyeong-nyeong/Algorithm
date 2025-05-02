package BOJ.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1157
public class StudyWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s =  br.readLine().toUpperCase();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }
        int max = 0;
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = String.valueOf((char) (i + 'A'));
            } else if (arr[i] == max) {
                result = "?";
            }
        }
        System.out.println(result);
    }
}
