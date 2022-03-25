import java.util.*;

public class Strings4 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert
        sb.insert(0, 'S');
        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);

        // append
        sb.append("ert");
        System.out.println(sb);

        // length
        System.out.println(sb.length());
    }
}
