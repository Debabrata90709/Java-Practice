public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    //Creation of Singly Linked List
    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method Singly Linked List
    public void insertInLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else {
            node.next = null;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // Deleting a node from Singly Linked List
    public void deletionOfNode() {
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
    }
}
