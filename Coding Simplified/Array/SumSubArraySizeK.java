package Array;

class ArraySizeK {

    public int findSubArrayofSizeKWithMaxSum(int[] arr, int k) {
        if (arr.length == 0 || k <= 0 || k > arr.length) {
            return -1;
        }

        int sum = 0, i;
        for (i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int max_sum = sum;
        int start = 0;

        for (int j = k; j < arr.length; j++) {
            sum = sum + arr[j] - arr[start++];

            if (sum > max_sum) {
                max_sum = sum;
            }
        }
        return max_sum;
    }
}

public class SumSubArraySizeK {

    public static void main(String[] args) {

        ArraySizeK a = new ArraySizeK();
        int arr[] = { 3, 2, 5, 4, 1 };

        System.out.println(a.findSubArrayofSizeKWithMaxSum(arr, 1));
    }
}