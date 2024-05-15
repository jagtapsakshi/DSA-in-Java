import java.util.*;

public class largestindex{

    public static int largest(int array[]){

        int n = array.length;

        int lidx =0;

        for(int i=0; i<n; i++){
            if(array[i]>array[lidx]){
                lidx = i;                 
            }       
        }
        return lidx;

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
        System.out.println("The largest element is present at index "+ largest(array));

    }
}

