package crackingthecodinginterview.chapter2.tests;

import crackingthecodinginterview.chapter2.A_RemoveDups;
import crackingthecodinginterview.node.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class A_RemoveDupsTest {
    @Test
    public void testRemoveDuplicates_EmptyList() {
        Node head = null;
        Node result = A_RemoveDups.removeDuplicates(head);
        assertNull(result);
    }

    @Test
    public void testRemoveDuplicates_NoDuplicates() {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);

        Node result = A_RemoveDups.removeDuplicates(head);

        // Verify the list remains unchanged
        assertEquals(1, result.data);
        assertEquals(2, result.next.data);
        assertEquals(3, result.next.next.data);
        assertNull(result.next.next.next);
    }

    @Test
    public void testRemoveDuplicates_WithDuplicates() {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(3);

        Node result = A_RemoveDups.removeDuplicates(head);

        // Verify duplicates are removed
        assertEquals(1, result.data);
        assertEquals(2, result.next.data);
        assertEquals(3, result.next.next.data);
        assertNull(result.next.next.next);
    }

    @Test
    public void testRemoveDuplicates_AllDuplicates() {
        Node head = new Node(2);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(2);
        head.appendToTail(2);

        Node result = A_RemoveDups.removeDuplicates(head);

        // Verify all duplicates are removed
        assertEquals(2, result.data);
        assertNull(result.next);
    }

    @Test
    public void testRemoveDuplicates_SingleNode() {
        Node head = new Node(1);

        Node result = A_RemoveDups.removeDuplicates(head);

        // Verify single node remains unchanged
        assertEquals(1, result.data);
        assertNull(result.next);
    }

    @Test
    public void testRemoveDuplicates_TwoDuplicateNodes() {
        Node head = new Node(1);
        head.appendToTail(1);

        Node result = A_RemoveDups.removeDuplicates(head);

        // Verify duplicate nodes are removed
        assertEquals(1, result.data);
        assertNull(result.next);
    }

    @Test
    public void testRemoveDuplicates_MultipleDuplicates() {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(4);
        head.appendToTail(1);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(4);

        Node result = A_RemoveDups.removeDuplicates(head);

        // Verify duplicates are removed
        assertEquals(1, result.data);
        assertEquals(2, result.next.data);
        assertEquals(3, result.next.next.data);
        assertEquals(4, result.next.next.next.data);
        assertNull(result.next.next.next.next);
    }
}
