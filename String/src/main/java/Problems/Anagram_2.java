package Problems;

import java.util.Arrays;

public class Anagram_2 {

    static final int CHAR = 256;
    public static void main(String[] args) {
        String s1 = "abaac";
        String s2 = "aacba";

        if (areAnagram(s1, s2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
    }

    private static boolean areAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int[] count = new int[CHAR];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
