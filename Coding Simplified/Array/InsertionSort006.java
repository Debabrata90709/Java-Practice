
import java.util.*;

public class InsertionSort006 {

    public static void insertionSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;

            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Entry o = new Entry();

        int Array1[] = o.EnterArrayElement();
        InsertionSort006.insertionSort(Array1);
        o.print(Array1);

    }

}

class Entry {
    public int[] EnterArrayElement() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Array1[] = new int[n];
        for (int i = 0; i < Array1.length; i++) {
            System.out.println("Enter Element:  " + (i + 1));
            Array1[i] = sc.nextInt();
        }
        return Array1;
    }

    public void print(int Array1[]) {
        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Array1[i] + " ");
        }
    }
}