package Array;

import java.util.HashSet;

class Match024 {

    public boolean checkIfProductOfPairMatchesValue(int[] arr, int val) {
        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (val % arr[i] == 0 && s.contains(val / arr[i])) {
                return true;
            }

            s.add(arr[i]);
        }

        return false;
    }
}

public class MultiplicationMatch024 {

    public static void main(String[] args) {

        Match024 a = new Match024();
        int arr[] = { 4, 2, 3, 10, 4, 15, 3, 6 };

        System.out.println(a.checkIfProductOfPairMatchesValue(arr, 18));
    }
}