package Sorting.InsertionSort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] inArray = {50,20,30,60,40,10};
        //{20,50,30,60,40,10}
        System.out.println("Before sorting");
        printArray(inArray);

        insertionSort(inArray);

        System.out.println("\nAfter sorting");
        printArray(inArray);
    }

    private static void insertionSort(int[] inArray) {

        for (int i = 1; i < inArray.length; i++) {

            int key = inArray[i];
            int j = i - 1;
            while(j >= 0 && inArray[j] > key){
                inArray[j+1] = inArray[j];
                j--;
            }
            inArray[j+1] = key;
        }

    }

    private static void printArray(int[] inArray) {

        for (int element : inArray) {
            System.out.print(element+" ");
        }

    }
}
