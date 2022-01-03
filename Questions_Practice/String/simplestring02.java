//Program to count 'i' ang 'n'

import java.lang.*;
import java.util.*;

public class simplestring02{
    public static void main(String args[])
    {
        // Scanner str=new Scanner(System.in);
        // System.out.println("Enter a String");
        // String str1 = str.nextString();
        // System.out.println("String is - "+str1);
        String s = "This is a String";
        
        int count1=0,count2=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if(c=='i')
            count1++;
            else if(c=='n')
            count2++;
        }
        System.out.println("i= "+count1+"  n= "+count2);
    }
}