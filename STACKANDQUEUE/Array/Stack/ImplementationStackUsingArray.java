package STACKANDQUEUE.Array.Stack;

public class ImplementationStackUsingArray {
//    /
//    lets make a constructor for this class which takes size of the stack
    int arr[];
    int size;
    ImplementationStackUsingArray(int n){
        arr=new int[n];
        size=n;
    }

//    implements the operation
    int top=-1;
//    initialy top =-1 means stack is empty

//    push operation
    void push(int val){
        if(top+1<size){
            top++;


            arr[top]=val;
        }
        else{
            throw new IndexOutOfBoundsException();
        }

    }

//    get top element
int peek() {
    try {
        if (top < 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        int ans = arr[top];
        return ans;
    } catch (IndexOutOfBoundsException e) {
        throw e; // Re-throw the exception for the caller to handle
    }
}

    void pop(){
        top--;
    }

    boolean isEmpty(){
        return top==-1;
    }
    int size(){
        return top>0?top+1:0;
    }


}
