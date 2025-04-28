package BOJ.입출력과_사칙연산;

import java.util.Scanner;

// 11382
public class LittleJeongmin {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long c = Long.parseLong(input[2]);

        System.out.println(a + b + c);
    }
}
