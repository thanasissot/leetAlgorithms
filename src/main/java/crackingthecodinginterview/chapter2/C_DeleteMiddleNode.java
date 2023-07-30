package crackingthecodinginterview.chapter2;

import crackingthecodinginterview.node.Node;

import java.util.Objects;

public class C_DeleteMiddleNode {
    public static Node deleteMiddleNode(Node head) {
        if (head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        int counter = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            counter++;
        }

        // size 2 linked list
        if (counter == 1) {
            head.next = null;
            return head;
        }

        if (slow != null && slow.next != null) {
            slow.data = slow.next.data;
            slow.next = slow.next.next;
        }
        return head;
    }
}
