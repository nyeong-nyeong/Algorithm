package leetcode.plan75.array_string;

public class GcdOfStrings {
    public String solution(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        int length = gcd(str1.length(), str2.length());

        return str1.substring(0, length);
    }

    public int gcd(int l1, int l2) {
        if (l1%l2 == 0) {
            return l2;
        } else return gcd(l2, l1 % l2);
    }
}
