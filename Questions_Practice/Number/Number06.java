/*

Check if a number is Automorphic number or not. It is a
number which is contained in the last digits of its square
e.g. 25 in 625

*/

import java.util.*;
public class Number06 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int m = n;
        int flag = 0, q = n*n;
        while(n!=0){
            int d=n%10;
            int d1=q%10;
            if(d!=d1) flag = 1;
            n = n/10; q = q/10;
        }
        if (flag==0)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not a Automorphic number");
    }
}
