//Check if a number is palindrome or not.

import java.util.*;
public class Number01 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
    int n = sc.nextInt();
    int m = n;
    int sum = 0;
    while(n!=0){
        int d = n%10;
        sum = sum*10 + d;
        n = n/10;
    }
    if (sum == m)
        System.out.println("Yes, The Number is Palindrome.");
    else
        System.out.println("No. The Number is not Palindrome.");
    
}
}
