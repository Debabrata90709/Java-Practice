public class LinkedList {
    public Node head;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void deletionOfNode() {
        head = head.next;
        size--;
    }
}