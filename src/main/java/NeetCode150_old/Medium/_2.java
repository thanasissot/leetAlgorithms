package NeetCode150_old.Medium;

import NeetCode150_old.InnerClasses.ListNode;

public class _2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;

        int cout = 0;
        int sum = Integer.MIN_VALUE;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + cout;
            if (sum >= 10) {
                cout = 1;
                sum %= 10;
            }
            else {
                cout = 0;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + cout;
            if (sum >= 10) {
                cout = 1;
                sum %= 10;
            }
            else {
                cout = 0;
            }
            l1 = l1.next;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }

        while (l2 != null) {
            sum = l2.val + cout;
            if (sum >= 10) {
                cout = 1;
                sum %= 10;
            }
            else {
                cout = 0;
            }
            l2 = l2.next;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }

        if (cout == 1) {
            temp.next = new ListNode(1);
        }
        return head.next;
    }
}

