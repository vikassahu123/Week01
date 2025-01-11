import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        int[][] matrixA = createRandomMatrix(2, 3);  // Example 2x3 random matrix
        int[][] matrixB = createRandomMatrix(2, 3);  // Another example 2x3 random matrix

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("\nMatrix A + Matrix B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Subtraction
        System.out.println("\nMatrix A - Matrix B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // Transpose
        System.out.println("\nTranspose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        // Determinant (only for 2x2 or 3x3 matrices)
        if (matrixA.length == 2 && matrixA[0].length == 2) {
            System.out.println("\nDeterminant of Matrix A:");
            System.out.println(determinant2x2(matrixA));
        } else if (matrixA.length == 3 && matrixA[0].length == 3) {
            System.out.println("\nDeterminant of Matrix A:");
            System.out.println(determinant3x3(matrixA));
        }

        // Multiply
        System.out.println("\nMatrix A * Matrix B:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        // Finding Inverse (only for 2x2 or 3x3 matrices)
        if (matrixA.length == 2 && matrixA[0].length == 2) {
            int[][] inverse = inverseMatrix2x2(matrixA);
            if (inverse != null) {
                System.out.println("\nInverse of Matrix A:");
                displayMatrix(inverse);
            } else {
                System.out.println("\nMatrix A is not invertible");
            }
        } else if (matrixA.length == 3 && matrixA[0].length == 3) {
            int[][] inverse = inverseMatrix3x3(matrixA);
            if (inverse != null) {
                System.out.println("\nInverse of Matrix A:");
                displayMatrix(inverse);
            } else {
                System.out.println("\nMatrix A is not invertible");
            }
        }
    }

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1 + random.nextInt(9); // Random integers between 1 and 10
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        int determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                        - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                        + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return determinant;
    }

    // Method to find the inverse of a 2x2 matrix
    public static int[][] inverseMatrix2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) return null;  // Matrix is not invertible
        int[][] inverse = {
            { matrix[1][1], -matrix[0][1] },
            { -matrix[1][0], matrix[0][0] }
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inverse[i][j] /= determinant;
            }
        }
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static int[][] inverseMatrix3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) return null;  // Matrix is not invertible
        int[][] adjoint = new int[3][3];
        adjoint[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjoint[0][1] = matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2];
        adjoint[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adjoint[1][0] = matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2];
        adjoint[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjoint[1][2] = matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2];
        adjoint[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        adjoint[2][1] = matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1];
        adjoint[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        int[][] inverse = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjoint[i][j] / determinant;
            }
        }
        return inverse;
    }
}
