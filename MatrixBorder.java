import java.util.Scanner;

public class MatrixBorder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Initialize the 2D array
        int[][] matrix = new int[rows][cols];

        // Input elements of the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Close the scanner
        sc.close();

        // Call the function to print the border elements
        printMatrixBorder(matrix, rows, cols);
    }

    // Function to print the border elements of the 2D array
    public static void printMatrixBorder(int[][] matrix, int rows, int cols) {
        // Print the top row
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] + " ");
        }

        // Print the right column (excluding the top and bottom corners)
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }

        // Print the bottom row if there is more than one row
        if (rows > 1) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(matrix[rows - 1][j] + " ");
            }
        }

        // Print the left column (excluding the top and bottom corners)
        for (int i = rows - 2; i > 0; i--) {
            System.out.print(matrix[i][0] + " ");
        }

        System.out.println();
    }
}
