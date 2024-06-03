import java.util.Scanner;

public class Jaggedarray {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Matrix is: ");

        int[][] numbers = new int[rows][];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new int[i + 1];
            // columns defined in the rows

            for (int j = 0; j < numbers[i].length; j++) {
                // numbers[i].length gives column numbers
                numbers[i][j] = i;
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
