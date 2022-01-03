/*

Check if a number is KM, Special number or not.
Where sum of factorial of digits is equal to the 
number e.g. 145 = 1! + 4! + 5!

*/

import java.util.*;
public class Number07 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int m = n;
        int sum = 0;
        while(n!=0) {
            int d = n%10;
            int fact = 1;
            for(int i=1; i<=d; i++) fact=fact*i;
            sum=sum+fact;
            n=n/10;
        }
        if(sum==m)
            System.out.println("KM Number");
        else
            System.out.println("Not a KM Number");
    }
}
