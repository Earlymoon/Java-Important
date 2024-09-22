package SORTING;

public class HeapSort {
//    O(NLOGN) TIME COMPLEXITY
//    O(1) SPACE COMPLEXITY
    public static void main(String[] args) {
        int arr[]={5,2,3,6,2,31,4,7,3};
        int n=arr.length;

        heapsort(arr);
        for(int num:arr) System.out.print(num+" ");
    }
    public static void heapsort(int arr[]){
        int n=arr.length;
//        first build max heap
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }

//        swap out end element with top element
//        and call heaify again

        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    public static void heapify(int arr[],int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n&&arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n&&arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapify(arr,n,largest);
        }

    }



}
