// Remove all duplicates from Sorted Array

public class RemoveDuplicates034 {

    public static int getUniqueNumberLengthWithRemovingDuplicates(int[] arr) {
        if (arr.length <= 1) {
            return arr.length;
        }

        int start = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[start++] = arr[i];
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 4, 4, 5, 6, 7, 7, 8 };

        System.out.println(RemoveDuplicates034.getUniqueNumberLengthWithRemovingDuplicates(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}