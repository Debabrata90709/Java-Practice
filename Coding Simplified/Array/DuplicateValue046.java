//Find Duplicate value present in 1 to n numbers range

public class DuplicateValue046 {

    public static int findDuplicateValue(int[] arr) {
        if (arr.length <= 1) {
            return -1;
        }

        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                int otherIndex = arr[i] - 1;

                int x = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = x;
            } else {
                i++;
            }
        }

        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 1 };

        System.out.println(DuplicateValue046.findDuplicateValue(arr));
    }

}
