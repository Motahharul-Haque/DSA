package BasicOperations;

public class Example2 {

    public static void main(String[] args) {
        String str1 = "learning_java";
        String str2 = "zee";

        int res = str1.compareTo(str2);

        if (res == 0) {
            System.out.println("Same");
        }
        if (res > 0) {
            System.out.println("S1 is greater");
        }
        if (res < 0) {
            System.out.println("S1 is smaller");
        }
    }
}
