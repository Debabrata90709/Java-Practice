public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    // Creation of a Doubly Linked List
    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
}