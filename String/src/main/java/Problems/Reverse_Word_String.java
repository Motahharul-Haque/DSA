package Problems;

public class Reverse_Word_String {
    public static void main(String[] args) {
        String s = "I love coding";
        int n = s.length();
        char[] str = s.toCharArray();
        System.out.println("After reversing word in the String");

        reverseWords(str, n);

        System.out.println(str);
    }

    private static void reverseWords(char[] str, int n) {
        int start = 0;

        for (int end = 0; end < n; end++) {
            if (str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str, start, n - 1);
        reverse(str, 0, n - 1);
    }

    private static void reverse(char[] str, int low, int high) {
        while(low <= high)
        {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;

            low++;
            high--;
        }
    }
}
