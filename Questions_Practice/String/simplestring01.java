//Program to count the vowels

import java.lang.*;
import java.util.*;

public class simplestring01{
    public static void main(String args[])
    {
        // Scanner str=new Scanner(System.in);
        // System.out.println("Enter a String");
        // String str1 = str.nextString();
        // System.out.println("String is - "+str1);
        String s = "This is a String";
        
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            count++;
        }
        System.out.println(count);
    }
}