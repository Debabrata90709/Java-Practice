package JavaTutorials;

public class String03 {
    public static void main(String args[]) {
        String s = "HelloWorld";
        char c1[] = new char[7];
        char c2[] = new char[7];
        s.getChars(2, 5, c1, 0);
        for (char ch1 : c1) {
            System.out.print(ch1 + "+");
        }
        System.out.println();
        s.getChars(2, 5, c2, 2);
        for (char ch2 : c2) {
            System.out.print(ch2 + "+");
        }
        System.out.println();
        char c3[] = { 'q', 'w', 'e', 'r', 't', 'y' };
        String s1 = String.copyValueOf(c3);
        System.out.println(s1);
    }
}
