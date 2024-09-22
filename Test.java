import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class Test {
//    int roll=3;
//    char ch='a';
//    static int id=5;

    public static void main(String[] args) {

//        Test test=new Test();
////        System.out.println(test.id);
//
//        String s="1";
//        int count=0;
//        s+=count++;
//
//        System.out.println(s);
//        s+=count++;
//        System.out.println(s);
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:arr)mp.put(num,mp.getOrDefault(num,0)+1);

        for(Map.Entry<Integer,Integer>e:mp.entrySet()){
            if(e.getValue()%2!=0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");


    }
}
