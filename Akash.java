import java.util.HashMap;
import java.util.*;
public class Akash {
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,5,5,7,6,9,10};
        int arr2[]={11,12,13,4,5,6,7,18,19,20};
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num:arr1)mp.put(num,mp.getOrDefault(num,0)+1);
        int ans=0;
        for(int num:arr2){
            if(mp.containsKey(num)){
                mp.remove(num);
            }
            else{
                mp.put(num,mp.getOrDefault(num,0)+1);
            }
        }
        for(Map.Entry<Integer,Integer>e:mp.entrySet()){
            ans+=e.getValue();
        }
        System.out.println(ans);
    }
}
