package leetcode.plan75.array_string;

public class ReverseVowels {
    public boolean findVowel(char a) {
        return "AEIOUaeiou".indexOf(a) != -1;
    }

    public String solution(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && !findVowel(arr[left])) {
                left++;
            }

            while (left < right && !findVowel(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[left] = temp;

            left++;
            left--;
        }
        return String.valueOf(arr);
    }
}
