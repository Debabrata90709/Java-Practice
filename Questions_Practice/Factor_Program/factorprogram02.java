/*

Find if a no. is a composite no. Its is a no. which has more than one factor
(excluding 1,n) e.g. 8=2, 4=1 factors

*/

import java.util.*;
public class factorprogram02 {
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
        if(count > 3)
        System.out.println("Composite Number");
        else
        System.out.println("Not a Composite Number.");
    }
}
