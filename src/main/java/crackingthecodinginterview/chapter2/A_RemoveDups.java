package crackingthecodinginterview.chapter2;

import crackingthecodinginterview.node.Node;

public class A_RemoveDups {
    // Have you tried a hash table? You should be able to do this in a single pass of the linked
    // list.

    // Without extra space, you'll need O(N2) time. Try using two pointers, where the second
    // one searches ahead of the first one.
    /**
     * remove duplicates from an unsorted linked list
     */
    public static Node removeDuplicates(Node head) {
        Node current = head;
        Node reset = current;

        while (current != null) {
            int data = current.data;

            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    continue;
                }

                current = current.next;
            }

            current = reset.next;
            reset = current;
        }

        return head;
    }
}
