package Matrix;
//search in a row-wise and column-wise sorted matrix

public class SearchElement {

    public static void main(String[] args) {
        int[][] mat = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 35, 45},
                {32, 33, 39, 50}};

        int key = 29;
        
        search(mat, key);
    }
    //procedure : 1. begin form the top right corner
    //2. if x is same, print position and return
    //3. if x is smaller, move left
    //4. if x is greater, move down
    //complexity : O(R+C)
    private static void search(int[][] mat, int key) {
        int i = 0, j = mat.length - 1;
        
        while(i< mat.length && j >= 0)
        {
            if (mat[i][j] == key) {
                System.out.println("Found at ("+i+", "+j+")");
                return;
            }
            else if(mat[i][j] > key)
            {
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not Found");
    }
}
