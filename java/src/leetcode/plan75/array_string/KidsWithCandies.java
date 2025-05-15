package leetcode.plan75.array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> solution(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> bool = new ArrayList<>();

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int candy : candies) {
            bool.add(max <= extraCandies + candy);
        }
        return bool;
    }
}
