import java.util.Scanner;

public class TwoDarray {

    public static void PassArray(int [][] numbers, int x){
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Number found at location " + i + "," + j);
                }
            }
        }
        
    }

    public static void Print(int [][] numbers, int x){
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
        System.out.print("Enter matrix: ");
        int[][] numbers = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number to search: ");
        int x = sc.nextInt();
        
        sc.close();
        PassArray(numbers, x);
        Print(numbers, x);
    }

}
