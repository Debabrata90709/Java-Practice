
class Geekyshows
{
    public static void main (String args[])
    {
        Son obj = new Son();
        obj.getdata(10,20);  // calling method of super class
        obj.disp();  // calling method of sub class
    }
}

class Father    //  super class
{
    int a,b;
    void getdata(int x,int y)   //method with parameter
    {
        a = x;
        b = y;
    }
}

class Son extends Father //sub class
{
    int add()   //  method
    { 
        int sum = a+b;
        return sum;
    }
    void disp()  //method
    {
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("Sum = "+add());
    }
}