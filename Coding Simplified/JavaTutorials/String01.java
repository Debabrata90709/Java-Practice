package JavaTutorials;

import java.net.SocketPermission;
import java.util.*;

public class String01 {
    public static void main(String args[]) {
        String s = "Java";
        String st = new String("C++");
        String se = null;
        s = "Oracle";
        System.out.println(s);
        String a[] = new String[3];
        a[0] = "qwerty";
        a[1] = "hello";
        a[2] = "hi";

        for (String d : a) {
            System.out.println(d);
        }
    }
}