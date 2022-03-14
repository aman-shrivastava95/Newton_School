package BinarySearch;

public class BinarySearch {
    static int binarySearch(int[] arr, int start, int end, int key){
        int ans = -1 ;
        while(start<=end){
            int mid = (start+end)/2 ;
            if(arr[mid] == key){
                ans = mid ;
                break ;
            }else if(key > arr[mid]){
                start = mid+1 ;
            }else{
                end = mid-1 ;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,10,40,60,70,80} ;
        int key = 10 ;
        int result = binarySearch(arr, 0, arr.length-1,key) ;

        if ((result == -1)) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element present at index: " + result);
        }
    }
}
