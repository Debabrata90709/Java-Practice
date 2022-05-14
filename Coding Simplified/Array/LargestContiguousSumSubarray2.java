
public class LargestContiguousSumSubarray2 {
    public static void main(String[] args) {

        Subarray an = new Subarray();
        int arr[] = { -3, -4, 4, -1, -2, 1, 5, -3 };

        an.largestContiguousSubArrayNegative(arr);
    }

}

class Subarray {
    public void largestContiguousSubArrayNegative(int arr[]) {
        int max_so_far, current_max;
        max_so_far = current_max = arr[0];
        int start, end, s;
        start = end = s = 0;

        for (int i = 1; i < arr.length; i++) {
            // current_max = Math.max(a[i], current_max + a[i]);

            if (arr[i] > current_max + arr[i]) {
                current_max = arr[i];
                s = i;
            } else {
                current_max = current_max + arr[i];
            }

            if (current_max > max_so_far) {
                max_so_far = current_max;
                start = s;
                end = i;
            }
        }
        System.out.println("Max: " + max_so_far);
        System.out.println("Indexes from: " + start + " to : " + end);
    }
}
