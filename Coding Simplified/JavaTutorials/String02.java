package JavaTutorials;

public class String02 {
    public static void main(String args[]) {
        String s = "    qwerty     ";
        int n = s.length();
        boolean b1 = s.startsWith("qw");
        boolean b2 = s.endsWith("ty");
        s = s.trim();
        char ch = s.charAt(4);
        String s1 = s.substring(4);
        String s2 = s.substring(2, 5);
        String s3 = "hello";
        String s4 = "Hello";
        boolean b3 = (s3 == s4);
        boolean b6 = (s3.equals(s4));
        boolean b9 = (s3.equalsIgnoreCase(s4));
        String s5 = "hello";
        boolean b4 = (s3 == s5);
        boolean b7 = (s3.equals(s5));
        String s6 = new String("hello");
        boolean b5 = (s3 == s6);
        boolean b8 = (s3.equals(s6));
        String s7 = "abcd";
        String s8 = "aecd";
        int i1 = s7.compareTo(s8);
        int i2 = s8.compareTo(s7);
        String s9 = "aabcxyzabc";
        int i3 = s9.indexOf("abc");
        int i4 = s9.indexOf("abx");
        int i5 = s9.indexOf("abc", 3);
        int i6 = s9.lastIndexOf("abc");
        int i7 = s9.lastIndexOf("abc", 5);
        String s10 = "asFGHHJBccc";
        String s11 = s10.toLowerCase();
        String s12 = s10.toUpperCase();
        char ch2[] = s10.toCharArray();
        for (char c : ch2) {
            System.out.println(c + "I");
        }

        System.out.println(n);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(ch);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(b3);
        System.out.println(b6);
        System.out.println(b9);
        System.out.println(b4);
        System.out.println(b7);
        System.out.println(b5);
        System.out.println(b8);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);
        System.out.println(s11);
        System.out.println(s12);
    }
}
