//Program to count words in string

import java.lang.*;
import java.util.*;

public class string01{
    public static void main(String args[])
    {
        // Scanner str=new Scanner(System.in);
        // System.out.println("Enter a String");
        // String str1 = str.nextString();
        // System.out.println("String is - "+str1);
        String s = "This is a String";
        s+=" ";
        String word=" ";
        int end=0,position=0,count=0;
        while(s.indexOf(' ',position)>0)
        {
            end = s.indexOf(' ',position);
            word = s.substring(position,end);
            count++;
            position=end+1;
        }
        System.out.println(count);
    }
}