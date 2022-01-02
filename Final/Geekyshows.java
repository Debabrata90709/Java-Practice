public class Geekyshows {
    public static void main(String args[])
    {
        Geek obj = new Geek();
        Geek1 obj1 = new Geek1();
        Geek2 obj2 = new Geek2();
        obj2.disp();
        Geek3 obj3 = new Geek3();
        obj3.disp(33);
        int a = 10;
        int sum = a + obj.roll;
        System.out.println("Roll1 = "+obj1.roll1);
        System.out.println("Sum = "+sum);
        System.out.println("Roll = "+obj.roll);
    }
}

class  Geek{
    final int roll;
    Geek()
    {
        roll = 101;
    }
}

class Geek1{
    static final int roll1;
    static{
        roll1= 1013;
    }
}

class Geek2{
    void disp()
    {
        final int roll2;
        roll2 = 2222;
        System.out.println("Roll2 = "+roll2);

    }
}

class Geek3 {
    void disp(final int b){
    System.out.println("Roll3 = "+b);
    }
}