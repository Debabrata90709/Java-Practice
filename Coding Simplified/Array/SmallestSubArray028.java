//Find smallest sub-array length with given sum

package Array;

import java.util.HashMap;
import java.util.Map;

class SubArray028 {

    public int findSmallestSubArrayofForGivenSumPositiveNumbers(int[] arr, int sum) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        int start, end, window_Sum, smallestLength;
        start = end = 0;
        window_Sum = 0;
        smallestLength = Integer.MAX_VALUE;

        while (end < arr.length) {
            window_Sum = window_Sum + arr[end];

            if (window_Sum == sum) {
                System.out.println("Start Index: " + start + ", End Index: " + end);
                smallestLength = Math.min(smallestLength, end - start + 1);
            }

            while (window_Sum > sum && start <= end) {
                window_Sum = window_Sum - arr[start++];

                if (window_Sum == sum) {
                    System.out.println("Start Index: " + start + ", End Index: " + end);
                    smallestLength = Math.min(smallestLength, end - start + 1);
                }
            }

            end++;
        }

        return smallestLength != Integer.MAX_VALUE ? smallestLength : -1;
    }

    public int findSmallestSubArrayofForGivenSum(int[] arr, int sum) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        int end, totalSumTillNow, smallestLength;
        end = 0;
        totalSumTillNow = 0;
        smallestLength = Integer.MAX_VALUE;

        Map<Integer, Integer> map = new HashMap<>();

        while (end < arr.length) {
            totalSumTillNow = totalSumTillNow + arr[end];

            if (totalSumTillNow == sum) {
                System.out.println("Start Index: " + 0 + ", End Index: " + end);
                smallestLength = Math.min(smallestLength, end + 1);
            }

            int windowSum = totalSumTillNow - sum;

            if (map.containsKey(windowSum)) {
                int start = map.get(windowSum);
                System.out.println("Start Index: " + (start + 1) + ", End Index: " + end);
                smallestLength = Math.min(smallestLength, end - start);
            }

            map.put(totalSumTillNow, end++);
        }

        return smallestLength != Integer.MAX_VALUE ? smallestLength : -1;
    }
}

public class SmallestSubArray028 {

    public static void main(String[] args) {

        SubArray028 a = new SubArray028();
        int arr[] = { 3, 2, 5, 5, 3, 2, 10 };
        int sum = 10;

        System.out.println(a.findSmallestSubArrayofForGivenSumPositiveNumbers(arr, sum));
        System.out.println(a.findSmallestSubArrayofForGivenSum(arr, sum));
    }
}