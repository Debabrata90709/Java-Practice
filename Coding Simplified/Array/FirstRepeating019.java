
import java.util.HashSet;
import java.util.Set;

class Repeating {

    /*
     * It'll return the first repeating value in array
     */
    public int firstRepeatingValueInArray(int[] arr) {
        Set<Integer> s = new HashSet<>();

        int firstRepeating = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.contains(arr[i])) {
                firstRepeating = arr[i];
            } else {
                s.add(arr[i]);
            }
        }

        return firstRepeating;
    }

}

public class FirstRepeating019 {

    public static void main(String[] args) {

        Repeating a = new Repeating();
        int arr[] = { 2, 3, 4, 4, 3, 5, 7 };

        System.out.println(a.firstRepeatingValueInArray(arr));

    }
}