public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    // push method
    public void push(int value) {
        linkedList.insertInLinkedList(value);
        System.out.println("Inserted " + value + " in stack");
    }

    // isEmpty method
    public boolean isEmpty() {
        if (linkedList.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // pop method
    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
        } else {
            result = linkedList.head.value;
            linkedList.deletionOfNode();
        }
        return result;
    }

    // peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    // delete method
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("The Stack is deleted");
    }
}