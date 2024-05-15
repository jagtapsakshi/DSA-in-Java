import java.util.Scanner;

public class reversearr {
    
    public static int reverse (int arr[]){
        
        int low = 0;
        int high = arr.length -1;

        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(int i=0; i<arr.length; i++){System.out.print(arr[i] + " ");}
    
    return 0;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.print("Enter size of arr:");
        int size = sc.nextInt();

        int array[] = new int[size];
        //input
        System.out.println("Enter arr elements: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        //output
        reverse(array);
    }
    
}
