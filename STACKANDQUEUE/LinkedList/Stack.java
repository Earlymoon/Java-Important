package STACKANDQUEUE.LinkedList;

public class Stack {
    Node top;

    Stack(){
        this.top=null;
    }

    //method to push the element into the stack
    void push(int val){
        Node newNode=new Node(val);
        newNode.next=top;
        top=newNode;
    }

//    method to pop out
    void pop(){
        if(top==null){
            throw  new NullPointerException("stack is empty");
        }
        top=top.next;
    }

//    method to get the top element
    int peek(){
        if(top==null){
            throw new NullPointerException("stack is empty");
        }
        return top.data;
    }

//    check is stack empty
    boolean isEmpty(){
        return (top==null);
    }

}
