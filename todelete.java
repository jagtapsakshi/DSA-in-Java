public class todelete {

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

    public static void deleteEle (int arr[]){

        int elementToDelete = largest(arr);
        int n = arr.length;

        int[] newArray = new int[arr.length - 1]; // New array with one less element
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToDelete) {
                newArray[newIndex] = arr[i];
                newIndex++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(newArray[i] + " ");
        }
    }
    
}
