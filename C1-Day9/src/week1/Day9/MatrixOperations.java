package week1.Day9;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Print the matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Find and print the sum of all elements in the matrix
        int sum = sumOfMatrix(matrix);
        System.out.println("Sum of all elements in the matrix: " + sum);

        // Transpose the matrix and print the result
        int[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Function to find the sum of all elements in the matrix
    public static int sumOfMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    // Function to transpose the matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

}
