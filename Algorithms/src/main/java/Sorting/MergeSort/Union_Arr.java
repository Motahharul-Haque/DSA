package Sorting.MergeSort;

import java.util.Arrays;

public class Union_Arr {
    public static void main (String[] args)
    {
        int a[] = new int[]{3,8,10};
        int b[] = new int[]{2,8,9,10,15};

        int m = a.length;
        int n = b.length;
       // printUnion(a,b,m,n);
        printUnion2(a,b,m,n);

    }

    //Naive Solution
    //T.C : O((m+n)*log(m+n))
    private static void printUnion(int[] a, int[] b, int m, int n) {

        int[] c = new int[m+n];

        //coping first element in new array
        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }
        //coping second array element in new array
        for (int i = 0; i < n; i++) {
            c[m+i] = b[i];
        }
        Arrays.sort(c);

        for (int i = 0; i< m+n; i++)
        {
            if (i == 0 || c[i] != c[i-1]) {
                System.out.print(c[i]+" ");
            }
        }
    }

    //Efficeint Solution
    //T.C : O(m+n)
    //S.C : O(1)

    private static void printUnion2(int[] a, int[] b, int m, int n) {
        int i = 0, j = 0;
        while(i < m && j < n)
        {
            if (i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            if (j > 0 && b[j-1] == b[j]) {
                j++;
                continue;
            }
            if(a[i] < b[j])
            {
                System.out.print(a[i]+" ");
                i++;
            }
            else if(a[i] > b[j])
            {
                System.out.print(b[j]+" ");
                j++;
            }
            else
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }

        while(i < m) {
            if (i == 0 || a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
                i++;
            }
        }
        while(j < n)
        {
            if (j == 0 || b[j] != b[j-1]) {
                System.out.println(b[j]+" ");
                j++;
            }
        }
    }

}
