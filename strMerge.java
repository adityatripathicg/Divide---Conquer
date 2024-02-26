public class strMerge {
    public static void mergeSort(String arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        //work
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); //left
        mergeSort(arr, mid+1, ei); //right
        merge(arr,mid,si, ei);

    }
    public static void merge(String arr[], int mid, int si,int ei){
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;   
        }
        //left part
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        //right part
        while (j<=ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0,i=si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }
    public static void printArr(String arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
