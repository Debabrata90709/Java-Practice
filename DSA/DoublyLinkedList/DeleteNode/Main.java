public class Main {
    public static void main(String args[]) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(3);
        System.out.println(dll.head.value);
        dll.insertDLL(4, 1);
        dll.insertDLL(5, 2);
        dll.insertDLL(6, 3);
        dll.insertDLL(7, 4);
        dll.traverseDLL();
        dll.reverseTraverseDLL();
        dll.searchNode(5);
        dll.deleteNodeDLL(3);
        dll.traverseDLL();
    }
}
