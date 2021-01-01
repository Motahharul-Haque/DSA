package Matrix;

public class MatRotate {

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println("Before Matrix Rotation : ");
        printMatrix(mat);

        rotate90(mat);

        System.out.println("After Matrix Rotation : ");
        printMatrix(mat);
    }

    private static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Procedure : In first step do the transpose of the matrix
    //and then reverse the columns elements in-place
    //Complexity : O(n^2)
    //Space : O(1)
    private static void rotate90(int[][] mat) {
        //code for transpose
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat.length; j++) {
                swap(mat, i, j);
            }
        }
        //code for reverse column
        for (int i = 0; i < mat.length; i++) {
           int low = 0, high = mat.length - 1;

           while(low < high)
           {
               swap2(mat, low, high,i);
               low++;
               high--;
           }

        }

    }

    private static void swap2(int[][] mat, int low, int high, int i) {
        int temp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = temp;
    }

    private static void swap(int[][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}
