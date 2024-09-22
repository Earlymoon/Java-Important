package STACKANDQUEUE.Array.Queue;

public class ImplementationQueueUsingArray {

    int front=0;
    int rear=0;

    int arr[];
    int count=0;
    int size;
    ImplementationQueueUsingArray(int n){
        arr=new int[n];
        size=n;
    }

//    push operation
    void push(int val){
        if(count<size){
            if(rear>size){
//                System.out.println(size+" "+rear);
                rear=rear%size;

            }
//            System.out.println(size+" "+rear);
            arr[rear]=val;
            rear++;
        }
        else{
            throw new IndexOutOfBoundsException("queue is full can't push more elements");
        }
    }

//    get peek element
    int peek(){
        if(rear==front){
            throw new NullPointerException("queue is empty no element found");
        }
       return arr[front];
    }

//    remove top element
    void pop(){
        if(front==rear){
            throw new NullPointerException("No element found to remove");
        }
        front++;
        count--;
    }

//  check empty
    boolean isEmpty(){
        return front==rear;
    }


}
