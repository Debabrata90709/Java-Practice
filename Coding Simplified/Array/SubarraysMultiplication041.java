//Find Subarrays with Multiplication of elements less than given Number

import java.util.ArrayList;
import java.util.List;

public class SubarraysMultiplication041 {

    public static List<List<Integer>> subArrayWithProductMultiplicationLessThanGivenNumber(int[] arr, int val) {
        int multiplicationOfElements = 1;
        int start = 0;
        List<List<Integer>> solution = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            multiplicationOfElements = multiplicationOfElements * arr[i];

            while (multiplicationOfElements >= val) {
                multiplicationOfElements = multiplicationOfElements / arr[start];
                start++;
            }

            List<Integer> list = new ArrayList<>();

            for (int j = i; j >= start; j--) {
                list.add(0, arr[j]);

                solution.add(new ArrayList<>(list));
            }
        }

        return solution;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 5, 3, 6, 3, 4, 2 };

        System.out.println(SubarraysMultiplication041.subArrayWithProductMultiplicationLessThanGivenNumber(arr, 19));
    }

}