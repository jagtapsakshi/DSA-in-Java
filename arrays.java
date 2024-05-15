import java.util.*;

public class arrays {

    public static void main(String args[]){

        Scanner sc =  new Scanner(System.in);
        sc.close();

        System.out.println("Enter size of arr:");
        int size = sc.nextInt();

        System.out.println("ENter number to search:");
        int x = sc.nextInt();
        
        int array[] = new int[size];
        //input
        System.out.println("Enter arr elements: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        //output
        for(int i=0; i<size; i++){
            if(array[i] == x){System.out.println(array[i]+" "+i);    
        }
                    
        }



    }
    
}
