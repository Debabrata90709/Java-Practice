class Geekyshows
{
    public static void main(String args[])
    {

    }
}

class Father        //super class
{
    int a = 100;
    void cal()      //Method
    {
        System.out.println("Super class Father\n");
    }
}

class Son extends Father    //sub class son
{
    int b = 200;
    void cal()      //Method overriding
    {
        int sum = a + b;
        System.out.println("Sub Class Son");
        System.out.println("Addition = "+sum);
    }
}

class Daughter extends Father       //sub class Daughter
{
    int c = 20;
    void cal()      //Method Overriding
    {
        int sum = a + b + c;
        System.out.println("Sub Class Daughter");
        System.out.println("Addition = "+sum);
    }
}