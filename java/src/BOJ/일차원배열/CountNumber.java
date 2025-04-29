package BOJ.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 10807
public class CountNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        List<Integer> array = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int target = Integer.parseInt(br.readLine());

        System.out.println(array.stream().filter(i -> i == target).count());
    }
}
