package leetcode.HashTable;

import java.util.Map;

public class RomanToInt {
    static final Map<String, Integer> List = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000);

    public int solution(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String c1 = String.valueOf(s.charAt(i));
            if(i == arr.length - 1) {
                count += List.get(c1);
                break;
            }
            switch (c1) {
                case ("I"):
                    String charI = String.valueOf(s.charAt(i + 1));
                    if (charI.equals("V") || charI.equals("X")) {
                        count += List.get(charI) - List.get(c1);
                        i++;
                        break;
                    }
                case ("X"):
                    String charX = String.valueOf(s.charAt(i + 1));
                    if (charX.equals("L") || charX.equals("C")) {
                        count += List.get(charX) - List.get(c1);
                        i++;
                        break;
                    }
                case ("C"):
                    String charC = String.valueOf(s.charAt(i + 1));
                    if (charC.equals("D") || charC.equals("M")) {
                        count += List.get(charC) - List.get(c1);
                        i++;
                        break;
                    }
                default:
                    count += List.get(c1);
                    break;
            }
        }
        return count;
    }
}
