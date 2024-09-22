package SORTING;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,2,3,6,2,31,4,7,3};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean isFlag=false;

            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isFlag=true;
                }

            }
            if(isFlag==false)break;
        }
        for(int num:arr) System.out.print(num+" ");
    }
}
