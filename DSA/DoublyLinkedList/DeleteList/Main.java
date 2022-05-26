public class Main {
    public static void main(String args[]) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(4, 7);
        dll.insertDLL(5, 8);
        dll.traverseDLL();
        dll.reverseTraverseDLL();
        dll.searchNode(5);
        dll.deleteNodeDLL(3);
        dll.traverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();
    }
}
