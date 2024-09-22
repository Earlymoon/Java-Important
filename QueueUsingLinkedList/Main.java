package QueueUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
//        System.out.println(queue.isEmpty());
//
//        System.out.println(queue.getFirst());
//        System.out.println(queue.getLast());

        queue.dequeue();
        System.out.println(queue.getFirst());
    }
}
