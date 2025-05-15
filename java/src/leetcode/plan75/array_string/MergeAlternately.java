package leetcode.plan75.array_string;

public class MergeAlternately {
    public String solution(String word1, String word2) {
        int totalLength = Math.max(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < totalLength; i++) {
            if(i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
