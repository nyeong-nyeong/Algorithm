package programmers.level0;

public class SaveTheCutArray {

    // 잘라서 배열로 저장하기
    // 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

    public String[] solution(String my_str, int n) {

        int array = my_str.length() / n;
        if (my_str.length() % n != 0) {
            array++;
        }
        String[] aa = my_str.split("");
        int a = 0;
        int b = 0;
        String[] newArr = new String[array];
        for (int i = 0; i < array; i++) {
            String slice = "";
            for (int j = 0; j < n; j++) {
                if (a < aa.length) {
                    slice += aa[a];
                    a++;
                } else {
                    slice += "";
                }
            }
            newArr[b] = slice;
            b++;
        }
        return newArr;
    }
}
