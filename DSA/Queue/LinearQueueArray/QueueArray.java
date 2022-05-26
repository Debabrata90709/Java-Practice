public class QueueArray {
    int arr[];
    int topOfQueue;
    int beginningOfQueue;

    // Creation
    public QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The queue is successfully created with size of : " + size);
    }

    // isFull method
    public boolean isFull() {
        if (topOfQueue == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty method
    public boolean isEmpty() {
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue method
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted" + value + "in the Queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted" + value + "in the queue");
        }
    }

    // deQueue method
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // peek method
    public int peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is Empty!");
            return -1;
        }
    }

    // delete method
    public void deleteQueue() {
        arr = null;
        System.out.println("The Queue is Successfully deleted!");
    }
}