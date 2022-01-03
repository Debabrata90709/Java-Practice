/*

Find if a no. is a Deficient no. Sum of factors is less
than the no. itself. e.g. 21. Factors 1,3,7 = 11 < 21

*/

import java.util.*;
public class factorprogram05 {
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
        if(sum < n)
        System.out.println("Deficient Number");
        else
        System.out.println("Not a Deficient Number.");
    }
}
