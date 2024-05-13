package programmers.level_0;

public class ArrayElementLength {

    // 배열 원소의 길이
    // 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
    public int[] solution(String[] strlist) {

        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            int strlist_len = strlist[i].length();
            answer[i] = strlist_len;
        }
        return answer;
        //  return Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}
