package JavaTutorials;

import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);
        int m = ab.nextInt();
        int n = ab.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ab.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}