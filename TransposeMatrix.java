import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter colums: ");
        int columns = sc.nextInt();
        System.out.println("Enter matrix: ");
        int[][] numbers = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        
        sc.close();
        System.out.println();
        int[][] transposedMatrix = TransposePrint(numbers);
        printMatrix(transposedMatrix);

    }

    public static int[][] TransposePrint(int [][] numbers){

        int n = numbers.length;
        int[][] transpose = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0;j<n; j++){
                transpose[i][j] = numbers[j][i];     
            }
        }
        
    return transpose;
    }

    public static void printMatrix(int[][] numbers) {
        for (int[] row : numbers) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}