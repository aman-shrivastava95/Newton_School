package sortingAlogs;

public class MergeSort {
    private static void merge(int[] arr, int left, int mid, int right){
        int subArr1 = mid-left+1 ;
        int subArr2 = right -mid ;

        //create temporary arrays
        int[] leftArr = new int[subArr1] ;
        int[] rightArr = new int[subArr2] ;

        //copy data from left and right part
        for(int i=0;i<subArr1;i++)leftArr[i] = arr[left+i] ;
        for(int i=0;i<subArr2;i++)rightArr[i] = arr[mid+1+i] ;

        //merge temp array left into arr[left...right]
        int i=0,j=0,k=left ;
        while(i<subArr1 && j<subArr2){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i] ;
                i++ ;
            }else{
                arr[k] = rightArr[j] ;
                j++ ;
            }
            k++ ;
        }
        //handle the leftovers
        while(i<subArr1){
            arr[k] = leftArr[i] ;
            i++ ;
            k++ ;
        }
        while(j<subArr2){
            arr[k] = rightArr[j] ;
            j++ ;
            k++ ;
        }
    }
    private static void mergeSortutil(int[] arr, int start, int end){
        if(start < end){
            int mid = (start+end)/2 ;
            mergeSortutil(arr,start, mid);
            mergeSortutil(arr, mid+1,end);
            merge(arr,start, mid, end) ;
        }
    }

    public static void mergeSort(int[] arr){
        mergeSortutil(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1} ;
        mergeSort(arr);
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
