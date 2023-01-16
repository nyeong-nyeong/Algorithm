package LevelZero;

import java.math.BigInteger;

public class SumBinaryNumber {

    // 이진수 더하기
    // 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

    public String solution(String bin1, String bin2) {
        String answer = "";
        BigInteger a = new BigInteger(bin1, 2);
        BigInteger b = new BigInteger(bin2, 2);
        BigInteger sum = a.add(b);

        return sum.toString(2);
    }

}
