package LRUCache;

public class Node {
    Node next;
    Node prev;
    int key;
    int value;
    Node(int key,int val){
        this.key=key;
        this.value=val;
    }

}
