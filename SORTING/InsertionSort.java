package SORTING;

public class InsertionSort {
    public static void main(String[] args) {

//        inplace and stable
//        O(n^2) time complexity
        int arr[]={5,2,3,6,2,31,4,7,3};
        int n=arr.length;
//        left side already sorted

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int num:arr) System.out.print(num+" ");
    }
}
