package STACKANDQUEUE.Array.Stack;

public class Stack {
    public static void main(String[] args) {
     ImplementationStackUsingArray st=new ImplementationStackUsingArray(5);
     st.push(2);
     st.push(5);
     st.push(7);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st.size());
        System.out.println(st.peek());
    }
}
