//Program to Capitalize each Word

import java.lang.*;
import java.util.*;

public class string03{
    public static void main(String args[])
    {
        // Scanner str=new Scanner(System.in);
        // System.out.println("Enter a String");
        // String str1 = str.nextString();
        // System.out.println("String is - "+str1);
        String s = "This is a String";
        s+=" ";
        String word=" ",s1=" ";
        int end=0,position=0;
        while(s.indexOf(' ',position)>0)
        {
            end = s.indexOf(' ',position);
            word = s.substring(position,end);
            s1 = s1 + Character.toUpperCase(word.charAt(0));
            s1 = s1 + word.substring(1) + " ";
            position=end+1;
        }
        System.out.println(s1.trim());
    }
}