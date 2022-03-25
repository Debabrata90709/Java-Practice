import java.util.*;

public class Bits2 {
    public static void main(String args[]) {

        // Clear Bit
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
