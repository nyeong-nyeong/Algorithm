package leetcode;

import java.util.PriorityQueue;

public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> o2-o1);
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            q.add(sum);
        }
        return q.poll();
    }
}
