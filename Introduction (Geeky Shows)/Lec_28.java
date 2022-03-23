import java.util.Scanner;
class Lec_28
{
    public static void main (String args[])
    {
        int a;
        float b;
        String str;
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter String");
        str = obj.nextLine();
        System.out.println("String "+str);
        System.out.print("Enter Integer");
        a = obj.nextInt();
        System.out.println("Integer "+a);
        System.out.print("Enter Float ");
        b = obj.nextFloat();
        System.out.println("Float "+b);
    }
}