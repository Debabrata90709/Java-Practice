package JavaTutorials;

public class Jagged {
    public static void main(String args[]) {
        int arr[][];
        arr = new int[3][];

        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[2];

        int arr1[][][];
        arr1 = new int[2][][];

        arr1[0] = new int[3][];
        arr1[1] = new int[2][];

        arr1[0][0] = new int[4];
        arr1[0][1] = new int[3];
        arr1[0][2] = new int[1];

        arr1[1][0] = new int[4];
        arr1[1][1] = new int[5];

    }
}
