//Program to swap case of a string

import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class simplestring03{
    public static void main(String args[])
    {
        // Scanner str=new Scanner(System.in);
        // System.out.println("Enter a String");
        // String str1 = str.nextString();
        // System.out.println("String is - "+str1);
        String strg = "This is a String";
        
        // int count1=0,count2=0;
        String s=" ";
        for(int i=0;i<strg.length();i++)
        {
            char c = strg.charAt(i);
            if(Character.isUpperCase(c))
            s+=Character.toLowerCase(c);
            else if(Character.isLowerCase(c))
            s+=Character.toUpperCase(c);
            else
            s+=c;
        }
        System.out.println("New String= " + s.trim());
    }
}