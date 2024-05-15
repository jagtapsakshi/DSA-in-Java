import java.util.Scanner;

public class sortedcheck {

    public static boolean sorted(int array[]){
        boolean flag = false;

        int n = array.length;
        for(int i=1; i<n; i++){
            if(array[i] > array[i-1]){
                flag = true;
            }
            else flag = false;
        }
        return flag;
    }


public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    sc.close();

    System.out.print("Enter size of arr:");
    int size = sc.nextInt();

    int array[] = new int[size];
    //inpu
    System.out.println("Enter arr elements: ");
    for(int i=0; i<size; i++){
        array[i] = sc.nextInt();
    }
    //output
    System.out.println("Array is "+ sorted(array));

    }   
}