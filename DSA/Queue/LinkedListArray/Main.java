class Main {
    public static void main(String args[]) {
        QueueLinkedList newQLL = new QueueLinkedList();
        boolean result = newQLL.isEmpty();
        System.out.println(result);
        newQLL.enQueue(10);
        newQLL.enQueue(20);
        newQLL.enQueue(30);
        newQLL.enQueue(40);
        int result1 = newQLL.deQueue();
        System.out.println(result1);
        int result2 = newQLL.peek();
        System.out.println(result2);
    }
}