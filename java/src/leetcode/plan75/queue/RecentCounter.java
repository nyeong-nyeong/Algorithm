package leetcode.plan75.queue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private final Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.offer(t);

        while(!q.isEmpty() && q.peek() > t - 3000) {
            q.poll();
        }

        return q.size();
    }
}
