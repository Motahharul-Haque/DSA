package Stack;

public class PrevGrElemNaive {

    public static void main(String[] args) {
        int[] arr = new int[] {20, 30, 10, 5, 15};

        printPrevGreater(arr, arr.length);
    }

    private static void printPrevGreater(int[] arr, int length) {

        for (int i = 0; i < length; i++) {
            int j;
            for (j = i-1; j >= 0 ; j--) {
                if (arr[j] > arr[i]) {
                    System.out.println(arr[j]+" ");
                    break;
                }
            }
            if (j == -1) {
                System.out.println(-1+" ");
            }
        }
    }
}
