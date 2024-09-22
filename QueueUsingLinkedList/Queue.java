package QueueUsingLinkedList;

public class Queue {
    Node front,rear;
    Queue(){
        front=rear=null;
    }

//    first check for is queue empty
    public boolean isEmpty(){
        return front==null&&rear==null;
    }

//    enqueue the value to the queue
    public void enqueue(int data){
        Node node=new Node(data);

//        first check is queue empty then both front and rear point to the same node

        if(isEmpty()){
            front=rear=node;
            return;
        }

//        then rear point to the next node and rear becomes new node
        rear.next=node;
        rear=node;


    }
    public void dequeue(){
//        first check is queue empty
        if(isEmpty()){
            System.out.println("Queue is empty can't b deqeue");
        }

        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    public int getFirst(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return front.data;

    }
    public int getLast(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return rear.data;
    }
}
