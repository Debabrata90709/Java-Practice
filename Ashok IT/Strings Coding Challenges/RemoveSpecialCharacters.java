public class RemoveSpecialCharacters {
    public static void main(String args[]) {
        String str = "BIUGBU&((^^&GHGHJ*&*)&";
        // Approach - 1 (replaceAll() method)
        String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainStr);
    }
}
