package Problems;

public class Palindrome_1 {

    public static void main(String[] args) {
       // String str1 = "ABCBA";
        //String str2 = "ABCA";
        String str3 = "ABBA";

        boolean res = isPal(str3);

        if (res)
            System.out.println("Given String is a palindrome");
        else
            System.out.println("Given String isn't a palindrome");
    }

    private static boolean isPal(String str) {
        StringBuilder br = new StringBuilder(str);
        br.reverse();
        return str.equals(br.toString());
    }
}
