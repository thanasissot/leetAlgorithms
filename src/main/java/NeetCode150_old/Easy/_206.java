package NeetCode150_old.Easy;

public class _206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode current = head;
        ListNode previous;
        while (current.next != null) {
            previous = head;
            head = current.next;
            current.next = current.next.next;
            head.next = previous;
        }

        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

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

    public static void main(String[] args) {

    }
}
