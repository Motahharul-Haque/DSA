package Stack;

public class NextGrElemNaive {

    public static void main(String[] args) {
        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};

        printGreater(arr, arr.length);
    }

    private static void printGreater(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            int j;
            for (j = i+1; j < length; j++) {
                if (arr[j] > arr[i]) {
                    System.out.println(arr[j]+" ");
                    break;
                }
            }
            if (j == length)
                System.out.println(-1+" ");
        }
    }
}
