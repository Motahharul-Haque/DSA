package Sorting.QuickSort.Partition;

public class SegregateProblem {

    public static void main(String[] args) {
        int[] inArray = { 15, -3, -2, 16};
        int len = inArray.length;

        //sortNaive(inArray, len);
        sortEfficient(inArray, len);

        for (int element: inArray) {
            System.out.print(element+" ");
        }
    }

    //Efficient Solution of the problem
    private static void sortEfficient(int[] inArray, int len) {
        int i = -1, j = len;

        while (true) {
            //traversing for negative elements
            do {
                i++;
            } while (inArray[i] < 0);

            //traversing for positive elements
            do {
                j--;
            }while (inArray[j] >= 0);

            if (i >= j) {
                return;
            }

            int temp = inArray[i];
            inArray[i] = inArray[j];
            inArray[j] = temp;
        }
    }

    //naive solution
    private static void sortNaive(int[] inArray, int len) {
        int[] temp = new int[len];
        int i = 0;

        //traversing for negative elements
        for (int j = 0; j < len; j++) {
            if (inArray[j] < 0) {
                temp[i++] = inArray[j];
            }
        }

        //traversing for positive elements
        for (int j = 0; j < len; j++) {
            if (inArray[j] > 0) {
                temp[i++] = inArray[j];
            }
        }

        //copying temp array to the original array
        for (int j = 0; j < len; j++) {
            inArray[j] = temp[j];
        }

    }
}
