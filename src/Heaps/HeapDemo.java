package Heaps;
//TODO:heap insertion and deletion
public class HeapDemo {
    static void maxHeapify(int[] arr, int node, int n){
        int left = 2*node + 1 ;
        int right = 2*node + 2 ;
        int largest = node ;
        if(left < n && arr[left] > arr[largest]){
            largest = left ;
        }
        if(right< n && arr[right] > arr[largest]){
            largest = right ;
        }
        if(largest!=node){
            int temp = arr[largest] ;
            arr[largest] = arr[node] ;
            arr[node] = temp ;
            //heapify the affected node
            maxHeapify(arr,largest,n);
        }
    }
    static void buildHeap(int[] arr){
        int n = arr.length ;
        //heapify all the internal nodes
        for(int i=n/2;i>=0;i--){
            maxHeapify(arr,i,n) ;
        }
    }
    public static void heapSort(int[] arr){
        buildHeap(arr);
        int n = arr.length ;
        int heap_size = n ;
        for(int i = n-1;i>0;i--){
            //swap curr with root
            int temp  = arr[0] ;
            arr[0] = arr[i] ;
            arr[i] = temp ;
            //decrease the heap size
            heap_size-- ;
            maxHeapify(arr, 0,heap_size);
        }
    }
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90} ;
        heapSort(arr);
        for(int i:arr){
            System.out.print(i+ " ");
        }

    }
}
