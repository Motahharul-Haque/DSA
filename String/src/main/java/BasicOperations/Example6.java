package BasicOperations;

public class Example6 {

    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";

        if (str1 == str2) {
            System.out.println("Yes");
        }
        else
            System.out.println("No");

        String str3 = new String("java");

        if (str1 == str3) {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
