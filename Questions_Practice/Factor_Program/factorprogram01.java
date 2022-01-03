/*

Find if a number is a prime number.
Prime Number is a number divisible by 1 and
itself. e.g. 5 has factor 1,5

*/

import java.util.*;
public class factorprogram01 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        
        int count = 0;
        for(int i=1; i<=n;i++){
            if(n%i==0)
            count++;
        }
        if(count == 2)
        System.out.println("Prime Number");
        else
        System.out.println("Not a Prime Number.");
    }
}
