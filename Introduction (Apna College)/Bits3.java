import java.util.*;

public class Bits3 {
    public static void main(String args[]) {

        // Update Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;
        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
