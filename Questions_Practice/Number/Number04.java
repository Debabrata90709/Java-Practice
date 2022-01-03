/*

Check if a number is Duck number or not. A number
which has zeroes present in it e.g. 402,280

*/

import java.util.*;
public class Number04 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int m = n;
        int count = 0;
        while(n!=0){
            int d = n%10;
            if(d==0) count++;
            n=n/10;
        }
        if (count>0)
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");
    }
}
