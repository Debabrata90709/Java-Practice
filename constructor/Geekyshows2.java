class Geekyshows2 {
    public static void main(String args[])
    {
        Test1 obj = new Test1(10,15);
    }
}

class Test1
{
    int x, y ; //Instance variable
    Test1(int a,int b)
    { 
        x = a;
        y = b;
        System.out.println("X: "+a);
        System.out.println("Y: "+b);
        System.out.println(" Parameterized Constructor invoked");

    }
}