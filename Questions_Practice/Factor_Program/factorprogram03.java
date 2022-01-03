/*

Find if a no. is Perfect number. A perfect number is equal
to sum of its divisors or factors except itself e.g. 6 = 1 + 2 + 3

*/

import java.util.*;
public class factorprogram03 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i=1; i<n;i++){
            if(n%i==0)
            sum = sum +i;
        }
        if(sum == n)
        System.out.println("Perfect Number");
        else
        System.out.println("Not a Perfect Number.");
    }
}
