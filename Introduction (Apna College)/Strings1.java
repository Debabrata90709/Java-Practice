import java.util.*;

public class Strings1 {
    public static void main(String args[]) {
        // concatenation
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName.length());
        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
