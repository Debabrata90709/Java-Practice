/*

Find if a no. is a Abundant no. Here sum of factor is
greater than the no. itself e.g. 12. Factors 1,2,3,4,6=16>12

*/

import java.util.*;
public class factorprogram04 {
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
        if(sum > n)
        System.out.println("Abundant Number");
        else
        System.out.println("Not a Abundant Number.");
    }
}
