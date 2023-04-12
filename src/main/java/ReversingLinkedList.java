import java.util.LinkedList;

public class ReversingLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
    }

/*  head references the list 1 -> 2 -> 3 -> NULL
    Manipulate the next pointers of each node in place and return head, now referencing the head of the list.
    Result expected: 3 -> 2 -> 1 -> NULL
*/
    public SinglyLinkedListNode revert(SinglyLinkedListNode head) {
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode next = null;
        SinglyLinkedListNode current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    };
}
