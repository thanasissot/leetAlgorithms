package crackingthecodinginterview.node;

/**
 * In this implementation, we don't have a Linked List data structure.
 * We access the linked list through a reference to the head Node of the linked list.
 */
public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    /**
     * add a Node with d value in the end of the linked list
     * @param d
     * Returns void
     */
    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    /**
     * Delete a single node of value d, if it exists
     * Return head of the linked list
     */
    Node deleteNode(Node head, int d) {
        Node n = head;

        if (n.data == d) {
            return head.next; /* moved head */
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                break;
            }

            n = n.next;
        }

        return head; /* head does not change */
    }


}
