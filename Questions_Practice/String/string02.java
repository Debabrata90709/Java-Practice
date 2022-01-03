//Program to find longest word

import java.lang.*;
import java.util.*;

public class string02{
    public static void main(String args[])
    {
        // Scanner str=new Scanner(System.in);
        // System.out.println("Enter a String");
        // String str1 = str.nextString();
        // System.out.println("String is - "+str1);
        String s = "This is a String";
        s+=" ";
        String word=" ",lword=" ";
        int end=0,position=0,l=0;
        while(s.indexOf(' ',position)>0)
        {
            end = s.indexOf(' ',position);
            word = s.substring(position,end);
            if(word.length()>l) {
                l = word.length();
                lword = word;
            }
            position=end+1;
        }
        System.out.println("word = " + lword + " len= " + l);
    }
}