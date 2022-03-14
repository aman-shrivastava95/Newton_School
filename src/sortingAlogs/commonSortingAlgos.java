package sortingAlogs;


public class commonSortingAlgos {
    //selection sort
    public static void selectionSort(int[] arr){
        int n = arr.length ;
        for(int i=0;i<n;i++){
            int min_idx = i ;
            for(int j=i;j<n;j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            //swap
            int temp = arr[min_idx] ;
            arr[min_idx] = arr[i] ;
            arr[i] = temp ;
        }
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length ;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j] ;
                    arr[j] =arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1} ;
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
