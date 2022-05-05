import java.util.Arrays;
public class Sort {
    public static void main(String args[]) {
        String input = "Debabrata";

        char arr[] = input.toCharArray();
        // Approach - 1
        char temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));

        // Approach - 2
        String str1 = "Priyadarshi";
        char[] charArray = str1.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}