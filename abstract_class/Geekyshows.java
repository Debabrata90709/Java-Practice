public class Geekyshows {
    public static void main(String args[]){
        Son s = new Son();
        Daughter d = new Daughter();
        s.disp();       //calling method of sub class son
        d.disp();       //calling method of sub class Daughter
    }
}

abstract class Father       //Super class, Abstract class
{
    abstract void disp();       //Abstract Method
}

class Son extends Father        //sub class son
{
    void disp()
    {
        System.out.println("Abstract method defined in sub class son");
    }
}

class Daughter extends Father   //Sub class Daughter
{
    void disp()
    {
        System.out.println("Abstract Method defined in sub class Daughter");
    }
}