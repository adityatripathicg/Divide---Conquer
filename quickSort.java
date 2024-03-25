public class quickSort {
        public static void quickS(int arr[], int si, int ei){
        //base case
        if (si>=ei) {
            return;
        }
        //last element 
        int pidx = partition(arr, si, ei);
        quickS(arr, si, pidx-1); //left 
        quickS(arr, pidx+1, ei); //right
    }

    // public static int partition(int arr[], int si, int ei){
    //     int pivot = arr[ei];
    //     int i = -1; // to make place for elements smaller then pivot
    //     for(int j=si; j<ei;j++){
    //        if (arr[j]<=pivot) {
    //         i++;
    //         //swap
    //         int temp = arr[j];
    //         arr[j] = arr[i];
    //         arr[i] = temp;
    //        } 
    //     }
    //     i++;
    //     int temp = pivot;
    //     arr[ei] = arr[i]; //dont write pivot = arr[i]
    //     arr[i] = temp;
    //     return i;
    // }
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // Initialize i to the index before the start index
        for (int j = si; j < ei; j++) { // Fixed the loop condition
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Swap arr[i+1] and arr[ei] to place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;
        return i + 1;
    }


    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,5,2};
        quickS(arr, 0, arr.length-1);
        printArr(arr);
    }
}
