package crackingthecodinginterview.node;

/**
 * In this implementation, we don't have a Linked List data structure.
 * We access the linked list through a reference to the head Node of the linked list.
 */
public class Node {
    public Node next = null;
    public int data;

    public Node() {}
    public Node(int d) {
        data = d;
    }

    /**
     * add a Node with d value in the end of the linked list
     * @param d
     * Returns void
     */
    public void appendToTail(int d) {
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
    public static Node deleteNode(Node head, int d) {
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

    @Override
    public String toString() {
        return "{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }

    // Helper method to print the linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Helper method to create a linked list with given values
    public static Node createLinkedList(int... values) {
        Node head = null;
        for (int val : values) {
            if (head == null) {
                head = new Node(val);
            } else {
                head.appendToTail(val);
            }
        }
        return head;
    }
}
