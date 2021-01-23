package Sorting.MergeSort;

public class Intersection_Merge {

    public static void main(String[] args) {

        int a[] = new int[]{3, 5, 10, 10, 10, 15, 15, 20};
        int b[] = new int[]{5, 10, 10, 15, 30};

        int m = a.length;
        int n = b.length;

        //intersection(a, b, m, n);
        intersection2(a, b, m, n);
    }
    //intersection means common elements
    //we traverse through all the element from the first array
    // and avoid duplicates
    //then for every element(duplicate excluded) we search the second array
    //T.C : O(m*n)
    private static void intersection(int[] a, int[] b, int m, int n) {

        for(int i=0;i<m;i++){
            if(i>0 && a[i-1]==a[i])
                continue;
            for(int j=0;j<n;j++)
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
        }
    }

    //efficient solution with complexity O(m+n) times
    //auxiliary space O(1)
    private static void intersection2(int[] a, int[] b, int m, int n) {

        int i = 0, j = 0;

        while(i < m && j < n)
        {
            if(i > 0 && a[ i-1 ] == a[i])
            {
                i++;
                continue;
            }
            else if(a[i] < b[j])
            {
                i++;
            }
            else if(a[i] > b[j])
            {
                j++;
            }
            else
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }
}
