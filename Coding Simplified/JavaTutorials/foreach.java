package JavaTutorials;

public class foreach {
    public static void main(String args[]) {
        int a[] = { 12, 34, 45, 56, 1 };
        int s = 0;
        for (int x : a) {
            s = s + x;
        }
        System.out.println("Total : " + s);
    }
}
