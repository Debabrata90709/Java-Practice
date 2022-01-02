public class Geekyshows2 {
    public static void main(String args[])
    {
        Son2 objs = new Son2();
        Daughter2 objd = new Daughter2();
        objs.getdata(10,20);
        objs.disp();
        objd.getdata(10,20);
        objd.disp();
    }
}

class Father2      // super class
{
    int a,b;
    void getdata(int x, int y)   // method with parameter
    {
        a = x;
        b = y;
    }
}

class Son2 extends Father2   // sub class Son
{ 
    int add()
    {
        return (a+b);
    }
    void disp()
    {
        System.out.println("A= "+ a);
        System.out.println("B= "+ b);
        System.out.println("Sum = "+ add());
    }
}

class Daughter2 extends Father2  // Sub class Daughter
{
    int mult()
    {
        return(a*b);
    }
    void disp()
    {
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("Multiplication = "+mult());
    }
}
