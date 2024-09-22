package SORTING;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={5,2,3,6,2,31,4,7,3};
        int n=arr.length;
        mergeSort(arr,0,n-1);
        for(int num:arr) System.out.print(num+" ");
    }
    public static void mergeSort(int arr[],int low,int high){

        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

    }
    public static void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[n1+i];
        }

        int i=0,j=0,k=low;
        while(i<n1&&j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }
    }
}
