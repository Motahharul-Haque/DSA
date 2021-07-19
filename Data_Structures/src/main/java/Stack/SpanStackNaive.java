package Stack;

public class SpanStackNaive {

    public static void main(String[] args) {
        int[] arr= new int[]{18,12,13,14,11,16};
        printSpan(arr, arr.length);
    }

    private static void printSpan(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            int span = 1;
            for (int j = i - 1; j > 0 && arr[j] <= arr[i]; j--) {
                span++;
            }
            System.out.println(span + " ");
        }
    }
}
