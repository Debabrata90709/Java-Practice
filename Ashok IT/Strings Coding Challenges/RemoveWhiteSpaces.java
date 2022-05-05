public class RemoveWhiteSpaces {
    public static void main(String args[]) {
        String str = "  l l l  ll  l j jj j  vh  b h h  ";
        String str1 = str.replaceAll("\\s", "");
        System.out.println(str1);
    }
}
