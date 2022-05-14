//Get Maximum of all Sub-arrays of size K

import java.util.Deque;
import java.util.LinkedList;

class Subarray030 {

    public void maxElementOfKSizeSubArray(int[] arr, int k) {
        if (arr.length == 0 || k <= 0 || k > arr.length) {
            return;
        }

        Deque<Integer> queue = new LinkedList<>();
        int i;
        for (i = 0; i < k; i++) {
            while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]) {
                queue.removeLast();
            }

            queue.addLast(i);
        }

        for (; i < arr.length; i++) {
            System.out.print(arr[queue.peek()] + " ");

            while (!queue.isEmpty() && i - k >= queue.peek()) {
                queue.removeFirst();
            }

            while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]) {
                queue.removeLast();
            }

            queue.addLast(i);
        }

        System.out.print(arr[queue.peek()]);
    }
}

public class MaximumOfSubarray030 {

    public static void main(String[] args) {

        Subarray030 a = new Subarray030();

        int arr[] = { 2, 5, 4, 3, 1, 7 };
        int k = 3;

        a.maxElementOfKSizeSubArray(arr, k);

    }
}