package LinkedList;

import jdk.jfr.FlightRecorderListener;

public class LinkedList {
    Node head;
    Node curr;
    LinkedList(){
        head=new Node(0);
        curr=head;
    }
    public void add(int val){
        Node node=new Node(val);
        curr.next=node;
        curr=curr.next;

    }

    public static void main(String[] args) {
        LinkedList li=new LinkedList();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        Node node=li.head.next;
        while(node!=null){
            System.out.println(node.val);
            node=node.next;
        }


    }
}
