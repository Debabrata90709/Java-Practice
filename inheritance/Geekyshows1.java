public class Geekyshows1 {
    public static void main(String args[])
    {
    GrandSon1 obj = new GrandSon1();
    obj.getdata(10,20);
    obj.disp();
    }
} 

class Father1        // Super class
{
    int a , b;
    void getdata(int x,int y)   // method with parameter
    {
        a = x;
        b = y;
    } 
}

class Son1 extends Father1    // intermediate sub class
{
    int c = 30;
    int add()
    {
        int sum = a+b+c;
        return sum;
    }
}

class GrandSon1 extends Son1   // sub class
{
    int d = 40;
    void disp()
    {
        System.out.println("A= " +a);
        System.out.println("B= " +b);
        System.out.println("C= " +c);
        System.out.println("D= " +d);
        System.out.println("Sum = " +add());
    }
}