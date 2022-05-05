import java.util.Arrays;

public class ReplaceCharacter {
    public static void main(String args[]) {
        String input = "opentext";
        char charToReplace = 't';
        // expected output = open1ex2

        // check char presense in string
        if (input.indexOf(charToReplace) == -1) {
            System.out.println("Given Character Not Available In Input String....  ");
            System.exit(0);
        }

        // Logic to replace char occurance in string

        // char[] arr = input.toCharArray(); // o p e n t e x t
        // int cnt = 1;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == charToReplace) { // a==t p==t e==t n==t t==t e==t x==t t==t
        // arr[i] = String.valueOf(cnt).charAt(0);
        // cnt++;
        // }
        // }
        // System.out.println(Arrays.toString(arr));

        int cnt = 1;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == charToReplace) {
                input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
                cnt++;
            }
        }
        System.out.println(input);
    }
}
