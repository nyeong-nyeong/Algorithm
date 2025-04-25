package BOJ.입출력과_사칙연산;

// 10430
public class Remainder {
    public static void main(String[] args) {
        String[] input = new java.util.Scanner(System.in).nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}
