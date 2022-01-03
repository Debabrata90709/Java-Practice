//Print all digits of a number 268 on different lines

import java.util.*;
public class Number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");
        int n = sc.nextInt();
        int m = n;
        while (n!=0){
            int d=n%10;
            System.out.println(d);
            n=n/10;
        }
    }

}
