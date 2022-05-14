public class Main {
    public static void main(String args[]) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(3);
        csll.insertCSLL(4, 1);
        csll.insertCSLL(5, 2);
        csll.insertCSLL(6, 8);
        System.out.println(csll.head.next.next.value);
    }
}
