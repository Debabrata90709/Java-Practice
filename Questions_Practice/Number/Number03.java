/*

Check if a Number is Niven/Harshad number or not. A Number
which is divisible by the sum of its digit. e.g. 156 = 1 + 5 +6 = 12

*/

import java.util.*;
public class Number03 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n  = sc.nextInt();

        int m = n;
        int sum = 0;
        while (n!=0) {
            int d = n%10;
            sum = sum + d;
            n = n/10;
        }
        if (m%sum==0)
            System.out.println("Niven/Harshad Number");
        else
            System.out.println("Not a Niven/Harshad Number");
    }
}
