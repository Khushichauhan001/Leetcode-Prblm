package Matrix;

class Transpose_Matrix {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] transposedMatrix = new int[n][m];
        for(int i= 0 ;i< m ;i++){
            for(int j=0 ; j<n ;j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;

    }
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
            };
    
            int[][] result = transpose(matrix);
    
            // Print the transposed matrix
            System.out.println("Transposed Matrix:");
            for (int[] row : result) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
