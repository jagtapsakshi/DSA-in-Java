import java.util.Scanner;

public class secondlargest {
   
    public static int largest(int array[]){

        int n = array.length;

        int lidx =0;

        for(int i=0; i<n; i++){
            if(array[i]>array[lidx] ){
                lidx = i;                 
            }       
        }
        return lidx;
    }

    public static int slargest(int array[]){

        int n = array.length;
        int slidx = 0;
        int lindex = largest(array);

        for(int i=0; i<n; i++){
            if(array[i]>array[slidx] && array[i]!= array[lindex]){
                slidx =i; 
            }
        }
        return slidx;
    }
    
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arr:");
        int size = sc.nextInt();

        int array[] = new int[size];
        //inpu
        System.out.println("Enter arr elements: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        //output
        System.out.println(slargest(array));

    }
    
}
