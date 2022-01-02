class Geekyshows
{
    public static void main (String args[])
    {
        Test obj = new Test();
    }
}

class Test
{
    int a; //Instance variable
    Test()
    {
        a = 10;
        System.out.println("A: "+a);
        System.out.println("Default Constructor invoked");
    }
}