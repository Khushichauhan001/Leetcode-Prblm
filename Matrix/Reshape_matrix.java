package Matrix;
import java.util.ArrayList;
import java.util.List;

public class Reshape_matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;       
        int n = mat[0].length;    
        
        
        if (m * n != r * c) {
            return mat;           
        }
        if(r==m && c==n){
            return mat;
          }
        
        
        int[][] reshapedMatrix = new int[r][c];
        int row = 0, col = 0;     

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshapedMatrix[row][col] = mat[i][j];
                col++;
                if (col == c) {   
                    col = 0;
                    row++;
                }
            }
        }
        
        return reshapedMatrix;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1, c = 4;

        int[][] result = matrixReshape(mat, r, c);
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}