package SORTING;

public class SelectionSort {
    public static void main(String[] args) {
//        find the smallest and put into the first
        int arr[]={5,2,3,6,2,31,4,7,3};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_Idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_Idx]){
                    min_Idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_Idx];
            arr[min_Idx]=temp;
        }


//        O(n^2) but not stable i.e. order of elements is not maintained
    }
}
