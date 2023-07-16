package NeetCode150_old.Easy;

import NeetCode150_old.InnerClasses.ListNode;

public class _237 {
    public void deleteNode(ListNode node) {
        ListNode prev = null;
        while (node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        node = prev;
        prev.next = null;
    }
}
