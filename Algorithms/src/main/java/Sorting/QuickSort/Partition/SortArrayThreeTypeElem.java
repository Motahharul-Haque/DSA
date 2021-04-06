package Sorting.QuickSort.Partition;

public class SortArrayThreeTypeElem {

    public static void main(String[] args) {
        int[] inArray = { 0, 1, 1, 2, 0, 1, 1, 2};
        int len = inArray.length;

        //sortNaive(inArray, len);
        sortEfficient(inArray, len);

        for (int e:inArray)
        {
            System.out.print(e+" ");
        }
    }

    //efficient solution using dutch flag algo
    private static void sortEfficient(int[] inArray, int len) {

        int l = 0, h = len - 1, mid = 0;

        while (mid <= h)
        {
            switch (inArray[mid])
            {
                case 0:
                    int temp = inArray[l];
                    inArray[l] = inArray[mid];
                    inArray[mid] = temp;
                    l++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = inArray[h];
                    inArray[h] = inArray[mid];
                    inArray[mid] = temp;
                    h--;
                    break;


            }
        }
    }

    //naive solution
    private static void sortNaive(int[] inArray, int len) {
        int[] temp = new int[len];
        int i = 0;

        //sorting 0's
        for (int j = 0; j < len; j++)
            if (inArray[j] == 0)
                temp[i++] = inArray[j];

        //sorting 1's
        for (int j = 0; j < len; j++)
            if (inArray[j] == 1)
                temp[i++] = inArray[j];

        //sorting 2's
        for (int j = 0; j < len; j++)
            if (inArray[j] == 2)
                temp[i++] = inArray[j];

        //manually copying arrays
        for (int j = 0; j < len; j++)
                inArray[j] = temp[j] ;


    }
}
