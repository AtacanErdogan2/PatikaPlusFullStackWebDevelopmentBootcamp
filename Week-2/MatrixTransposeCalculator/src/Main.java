import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void printTransposeMatrix(int[][] transposeMatrix) {
        System.out.println("\n********Transpose of the matrix********");
        for (int[] matrix : transposeMatrix) {
            System.out.println(Arrays.toString(matrix));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the matrix transpose calculator :)\n");

        // Retrieving data from the user
        System.out.print("Enter the number of rows of the matrix :");
        int rowSize = scan.nextInt();

        System.out.print("Enter the number of columns of the matrix :");
        int columnSize = scan.nextInt();

        int[][] matrix = new int[rowSize][columnSize];
        int[][] transposeMatrix = new int[columnSize][rowSize];

        // Calculation Section
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + i + "] " + "[" + j + "] :");
                int matrixElement = scan.nextInt();
                matrix[i][j] = matrixElement;
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        printTransposeMatrix(transposeMatrix);

    }
}

