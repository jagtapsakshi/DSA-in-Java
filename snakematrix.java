import java.util.Scanner;

public class snakematrix {

    public static void SnakematrixPrint(int[][] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numbers[i].length; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
            } else {
                for (int j = numbers[i].length-1; j >= 0; j--) {
                    System.out.print(numbers[i][j] + " ");
                }

            }
        }

    }

    public static void Print(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

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
        Print(numbers);
        System.out.println();
        SnakematrixPrint(numbers);

    }

}