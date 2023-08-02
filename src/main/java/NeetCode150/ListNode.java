package NeetCode150;

import crackingthecodinginterview.node.Node;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void appendToTail(int d) {
        ListNode end = new ListNode(d);
        ListNode n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
}
