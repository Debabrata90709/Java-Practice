import java.lang.*;
import java.util.*;

class SearchMax
{
public static void main(String args[])
    {
        int[] a = {4,3,5,2,8,1,6};
        int max = a[0];
        for(int i = 1; i<a.length; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum element is "+ max);
    }
}