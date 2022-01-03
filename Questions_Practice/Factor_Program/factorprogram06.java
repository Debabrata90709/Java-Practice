/*

Find if a number is a Pronic no. Pronic number is the
product of two consecutive integers, n(n+1). e.g. 56=7*8
*/

import java.util.*;
public class factorprogram06 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        
        int fact = 0;
        for(int i=1; i<n;i++){
            if(n%i==0)
            if(i*(i+1)==n) fact = i;
        }
        if(fact!=0)
        System.out.println("Pronic Number");
        else
        System.out.println("Not a Pronic Number.");
    }
}
