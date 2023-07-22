package crackingthecodinginterview.chapter2;

import crackingthecodinginterview.node.Node;

import static crackingthecodinginterview.node.Node.printLinkedList;

public class B_KthToLast {

    // What if you knew the linked list size?
    // What is the difference between finding the Kth-tolast element and finding the Xth element?

    // If you don't know the linked list size, can you compute it? How does this impact the
    // runtime?

    // Try implementing it recursively. If you could find the (K-l)th to last element, can you
    // find the Kth element?

    // You might find it useful to return multiple values. Some languages don't directly support
    // this, but there are workarounds in essentially any language. What are some of those
    // workarounds?

    // Can you do it iteratively? Imagine if you had two pointers pointing to adjacent nodes
    // and they were moving at the same speed through the linked list. When one hits the end
    // of the linked list, where will the other be?

    /**
     * Explain K-th To Last:
     * If linked list has 10 Nodes and the K=4 than the 0-index Kth element is the 6th element
     * --
     * Algorithm to find the kth to last element of a singly linked list.
     *
     * --
     * MyNotes ->
     * Method 1: find the length of the linked list N, than the K-thToLast element
     *           is the N - (N - K - 1) element
     */
    public static int kthToLast(int k, Node head) {
        int length = 1;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        int index = length - 1 - (length - k);
        temp = head;
        while(index > 0) {
            temp = temp.next;
            index--;
        }

        return temp.data;
    }

    public static void main(String[] args) {
        Node head = null;
        for (int i = 0; i < 10; i++) {
            if (head == null) {
                head = new Node(i);
            } else {
                head.appendToTail(i);
            }
        }

        // Print the linked list to verify its contents
        printLinkedList(head);
        System.out.println();
        System.out.println(kthToLast(4, head));


    }

}
