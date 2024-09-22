package LRUCache;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    Node head;
    Node tail;
    int capacity;
    Map<Integer,Node>mp;
    LRUCache(int cap){
        this.capacity=cap;
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
        mp=new HashMap<>();
    }


//    first method to add
    public void put(int key,int val){
        if(mp.containsKey(key)){
            Node node=mp.get(key);
            remove(node);
            insert(new Node(key,val));
        }
        else{
            if(mp.size()==capacity){
                remove(tail.prev);

            }
            insert(new Node(key,val));
        }
    }

//    get
    int get(int key){
        if(mp.containsKey(key)){
            Node node=mp.get(key);
            remove(node);
            insert(new Node(key,node.value));
            return node.value;
        }

        return -1;
    }


    public void insert(Node node){
//        insert just after the head
        mp.put(node.key,node);
        node.next=head.next;
        node.next.prev=node;
        node.prev=head;
        head.next=node;
    }
    public void remove(Node node){
//        remove from the last
        mp.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;

    }

    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(5);
        lruCache.put(1,10);
        lruCache.put(2,20);
        lruCache.put(3,30);
        lruCache.put(4,40);
        lruCache.put(5,50);
        lruCache.put(6,60);
        System.out.println(lruCache.get(1));

    }



}
