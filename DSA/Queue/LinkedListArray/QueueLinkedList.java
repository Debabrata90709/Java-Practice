public class QueueLinkedList {
    LinkedList list;

    // Creation of LInked List
    public QueueLinkedList() {
        list = new LinkedList();
        System.out.println("The Queue is successfully created");
    }

    // isEmpty method
    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue Method
    public void enQueue(int value) {
        list.insertInLinkedList(value);
        System.out.println("Successfully inserted " + value + " in the queue.");
    }

    // deQueue Method
    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
        } else {
            value = list.head.value;
            list.deletionOfNode();
        }
        return value;
    }

    // peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    // delete method
    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("The queue is successfully deleted");
    }
}
