package leetcode.plan75.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PredictPartyVictory {
    public String solution(String senate) {
        Queue<Integer> dir = new LinkedList<>();
        Queue<Integer> radi = new LinkedList<>();
        int sLength = senate.length();

        for (int i = 0; i < sLength; i++) {
            if (senate.charAt(i) == 'R') {
                radi.offer(i);
            } else dir.offer(i);
        }

        while (!dir.isEmpty() && !radi.isEmpty()) {
            int d = dir.poll();
            int r = radi.poll();

            if (r < d) {
                radi.offer(++sLength);
            } else dir.offer(++sLength);
        }

        return dir.isEmpty() ? "Radiant" : "Dire";
    }
}
