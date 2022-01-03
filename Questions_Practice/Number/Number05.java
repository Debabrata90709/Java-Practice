/*

Check if a number is Neon number or not. Where sum of digits of
square of the number is equal to the number e.g. 9, 9*9 = 81, 9 = 8+1

*/

import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Number05 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int m=n;
        int sum = 0; n = n*n;
        while(n!=0){
            int d = n%10;
            sum=sum +d;
            n=n/10;
        }
        if (sum==m)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }
}
