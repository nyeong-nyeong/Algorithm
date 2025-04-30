package BOJ.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// 1546
public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> scores = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            scores.add(Integer.parseInt(st.nextToken()));
        }
        double max = scores.stream().mapToInt(Integer::intValue).max().orElse(0);
        List<Double> collect = scores.stream().map(s -> s / max * 100).collect(Collectors.toList());
        System.out.println(collect.stream().mapToDouble(Double::doubleValue).sum() / N);
    }
}
