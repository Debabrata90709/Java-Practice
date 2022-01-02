public class Geekyshows3 {
    public static void main(String args[])
    {
        Test2 obj = new Test2(12);
        Test2 obj1 = new Test2(3.7f);
        Test2 obj2 = new Test2(34,324);


    }
}

class Test2
{
    int x,z,k; //Instance variable
    float y; //Instance variable
    Test2(int a) //Parameterized constructor
    {
        x = a;
        System.out.println("X: "+ x);
    }
    Test2 (float a) // Parameterized constructor
    {
        y= a;
        System.out.println("Y: "+ y);
    }
    Test2 (int a, int b)
    {
        z = a;
        k = b;
        System.out.println("z: "+z);
        System.out.println("K: "+k);
    }
}