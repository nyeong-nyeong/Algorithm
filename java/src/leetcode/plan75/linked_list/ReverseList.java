package leetcode.plan75.linked_list;

public class ReverseList {
    public class ListNode {
        private int val;
        private ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode solution(ListNode head) {
        ListNode result = null;

        while (head.next != null) {
            ListNode temp = head.next;
            result = head;
            head = temp;
        }
        return result;
    }
}
