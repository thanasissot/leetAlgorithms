package crackingthecodinginterview.chapter2.tests;

import crackingthecodinginterview.node.Node;
import org.junit.jupiter.api.Test;

import static crackingthecodinginterview.chapter2.C_DeleteMiddleNode.deleteMiddleNode;
import static org.junit.jupiter.api.Assertions.*;

public class C_DeleteMiddleNodeTest {
    @Test
    public void testRemoveMiddleNode_OddLengthList() {
        Node head = createLinkedList(1, 2, 3, 4, 5);

        // Middle node is 3 (Odd length list)
        deleteMiddleNode(head);

        // Verify the list after removing the middle node
        int[] expectedList = {1, 2, 4, 5};
        assertLinkedListValues(head, expectedList);
    }

    @Test
    public void testRemoveMiddleNode_EvenLengthList() {
        Node head = createLinkedList(1, 2, 3, 4);

        // Middle node is 2 (Even length list)
        deleteMiddleNode(head);

        // Verify the list after removing the middle node
        int[] expectedList = {1, 2, 4};
        assertLinkedListValues(head, expectedList);
    }

    @Test
    public void testRemoveMiddleNode_SingleNodeList() {
        Node head = new Node(1);

        // Single node list (Middle node is the same as head)
        head = deleteMiddleNode(head);

        // Verify the list after removing the middle node
        assertNull(head);
    }

    @Test
    public void testRemoveMiddleNode_TwoNodeList() {
        Node head = createLinkedList(1, 2);

        // Middle node is 1 (Two node list)
        deleteMiddleNode(head);

        // Verify the list after removing the middle node
        int[] expectedList = {1};
        assertLinkedListValues(head, expectedList);
    }

    // Helper method to create a linked list with given values
    private Node createLinkedList(int... values) {
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

    // Helper method to assert the values in the linked list
    private void assertLinkedListValues(Node head, int[] expectedValues) {
        Node current = head;
        for (int expectedValue : expectedValues) {
            assertNotNull(current);
            assertEquals(expectedValue, current.data);
            current = current.next;
        }
        assertNull(current);
    }
}
