package leetcode.plan75.two_pointer;

public class InSubSequence {
    public boolean solution(String s, String t) {
        char[] sChar = s.toCharArray();
        if (sChar.length == 0) return true;
        char[] tChar = t.toCharArray();
        int count = 0;
        for (char w : tChar) {
            if (w == sChar[count]) count++;
            if (count == sChar.length) return true;
        }
        return false;
    }
}
