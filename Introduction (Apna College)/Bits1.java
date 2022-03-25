import java.util.*;

public class Bits1 {
    public static void main(String args[]) {

        // Set Bit
        int n = 5; // 0101
        int pos = 3;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
