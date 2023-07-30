package crackingthecodinginterview.chapter2;

import NeetCode150.LeetCode_86;
import crackingthecodinginterview.node.Node;

public class D_Partition {
    public Node partition(Node head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        Node list1 = new Node();
        Node head1 = list1;
        Node list2 = new Node();
        Node head2 = list2;

        Node temp = head;
        while (temp != null) {
            Node insert = new Node(temp.data);
            if (temp.data < x) {
                list1.next = insert;
                list1 = list1.next;
            } else {
                list2.next = insert;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (head1 == list1) {
            if (head2 == list2) {
                return head;
            }
            head2 = head2.next;
            return head2;
        } else {
            head1 = head1.next;
            if (head2 == list2) {
                return head1;
            }
            head2 = head2.next;
            list1.next = head2;
            return head1;
        }
    }
}
