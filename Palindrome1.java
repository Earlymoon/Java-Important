import java.util.HashMap;
import java.util.Map;

public class Palindrome1 {
    public static void main(String[] args) {
//        String s="The lovely lady is looking lovely as all lady look lovely";
//        String str[]=s.split(" ");
//        Map<String,Integer>mp=new HashMap<>();
//        for(String st:str)mp.put(st,mp.getOrDefault(st,0)+1);
//        for(Map.Entry<String,Integer>e:mp.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
        int a=5;
        int b=6;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);

//        String s=new String("chandra");
//        String s2="chandra";
//        String s3=s.intern();//it retreives the refrences from the strig  pool
//        string pool is used to optimise the storage
//        basically it is stored in the heap are when a new string is made
//        if string is already preseent then it gives the f=refrenses f=onk from the heap and new copy does not form
//        System.out.println(s2==s3);


    }
}
