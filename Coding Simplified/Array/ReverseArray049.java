// Reverse array elements | Using new array | Using Swapping elements | Using Library Func

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray049 {

    // First Method
    private int[] reverseAnArray1(int[] arr, int n) {
        if (arr.length <= 1) {
            return arr;
        }

        int[] new_array = new int[n];
        int j = n;

        for (int i = 0; i < n; i++) {
            new_array[j - i - 1] = arr[i];
        }
        return new_array;
    }

    // Second Method
    private void reverseAnArray2(int arr[], int n) {

        if (arr.length <= 1) {
            return;
        }

        int t = 0;
        for (int i = 0; i < n / 2; i++) {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }

    }

    // Reverse Through recursion
    private void reverseAnArray3(int arr[], int start, int end) {

        if (arr.length <= 1) {
            return;
        }

        if (start >= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseAnArray3(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        ReverseArray049 reverse = new ReverseArray049();
        int arr[] = { 1, 2, 3, 4, 5 };

        // Method 1
        int[] reversed_array = reverse.reverseAnArray1(arr, arr.length);

        for (int i = 0; i < reversed_array.length; i++) {
            System.out.print(reversed_array[i] + " ");
        }

        System.out.println();

        // Method 2
        reverse.reverseAnArray2(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Method 3
        Integer arr2[] = { 1, 2, 3, 4, 5 };

        Collections.reverse(Arrays.asList(arr2));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}