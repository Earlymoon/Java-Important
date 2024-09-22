package SORTING;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={5,2,3,6,2,31,4,7,3};
        int n=arr.length;
        quicksort(arr,0,n-1);
        for(int num:arr) System.out.print(num+" ");
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high)
        {
            int p=partition(arr,low,high);
            quicksort(arr,low,p-1);
            quicksort(arr,p+1,high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++ ){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}
