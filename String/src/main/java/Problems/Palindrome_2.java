package Problems;

public class Palindrome_2 {

    public static void main(String[] args) {
        //String str = "ABCBA";
        //String str = "ABCA";
        String str = "ABBA";

        boolean res = isPal(str);

        if (res)
            System.out.println("Given String is a palindrome");
        else
            System.out.println("Given String isn't a palindrome");
    }

    private static boolean isPal(String str) {
        int begin = 0;
        int end = str.length() - 1;

        while (begin < end)
        {
            if (str.charAt(begin) != str.charAt(end))
                return false;

            begin++;
            end--;
        }
        return true;
    }
}
