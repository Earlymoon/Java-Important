package STACKANDQUEUE.Array.Queue;

public class Queue {
    public static void main(String[] args) {
        ImplementationQueueUsingArray queue=new ImplementationQueueUsingArray(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

//        queue.push(6);
    }

}
