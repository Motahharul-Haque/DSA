package PatternMatching;

public class CheckRotation {

    public static void main(String[] args) {
        String s1 = "ABCD", s2 = "CDAB";

        if (areRotations(s1, s2)) {
            System.out.println("Strings are rotations of each other");
        }
        else
        {
            System.out.println("Strings are not rotations of each other");
        }
    }

    private static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return ((s1+s2).indexOf(s2) >= 0);
    }
}
