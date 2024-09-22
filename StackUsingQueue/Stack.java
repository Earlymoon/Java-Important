package StackUsingQueue;

public class Stack {

    Node head;
    int size;
    Stack(){
        this.head=null;
        size=0;
    }


//    is empty
    public boolean isEmpty(){
        return head==null;
    }

//    push operation
    public void push(int data){
        Node node=new Node(data);

//        check if new node creation is out of limit
        if(node==null){
            System.out.println("Stack Overflow...");
        }

        node.next=head;
        head=node;
        size++;

    }
//    pop operation
    public int pop(){
        if(head==null){
            throw new NullPointerException();
        }
        int temp=head.data;
        head=head.next;
        size--;
        return temp;
    }

//    get peek
    public int peek(){
        if(head==null){
            throw new NullPointerException();
        }
        return head.data;
    }
    public int size(){
        return size;
    }
}
