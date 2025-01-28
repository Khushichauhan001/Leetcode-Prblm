package Matrix;
import java.util.*;
import java.util.ArrayList;


public class DaigonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        int m = mat.length, n = mat[0].length;
        List<Integer> result = new ArrayList<>();

       
        for (int d = 0; d < m + n - 1; d++) {
           
            if (d % 2 == 0) {
                
                int row = Math.min(d, m - 1);
                int col = d - row;
                while (row >= 0 && col < n) {
                    result.add(mat[row][col]);
                    row--;
                    col++;
                }
            } else {

                int col = Math.min(d, n - 1);
                int row = d - col;
                while (col >= 0 && row < m) {
                    result.add(mat[row][col]);
                    row++;
                    col--;
                }
            }
        }

        
        int[] resArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }

        return resArray;
    }

    public static void main(String[] args) {
        DaigonalOrder obj = new DaigonalOrder();

        
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(Arrays.toString(obj.findDiagonalOrder(mat1))); 
       
        int[][] mat2 = {
            {1, 2},
            {3, 4}
        };
        System.out.println(Arrays.toString(obj.findDiagonalOrder(mat2))); 
       
    }
}

