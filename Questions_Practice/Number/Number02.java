
/*
Check if a number is spy number or not. 
Means sum of its digits 
equal to the product of the digits. 
e.g. 123, 1+2+3=1*2*3
*/

import java.util.*;
public class Number02 {
    public static void main(String srgs[])
    {
        Scanner sc = new Scanner(System.in);432
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        //int m = n;
        int sum = 0, prod = 1;

        while(n!=0){
            int d = n%10;
            sum = sum + d; prod = prod *d;
            n = n/10;
        }
        if(sum==prod)
        System.out.println("Spy Number");
        else
        System.out.println("Not a Spy Number");
    }
}
