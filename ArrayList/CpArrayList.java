package ArrayList;

public class CpArrayList {
    private int elements[];
    private int size=0;
    CpArrayList(int capacity){
        elements=new int[capacity];
    }

//    first check if list is empty
    public boolean isEmpty(){
        return size==0;
    }

//    size of the list
    public int getSize(){
        return size;
    }

//    add function
    public void add(int num){
        if(size==elements.length){
//            means list is full we have to make it double length of previous
            resize();

        }
        elements[size]=num;
        size++;

    }
//    resize the list
    public void resize(){
        int n=elements.length;
        int newElements[]=new int[2*n];
//        copy all the previous elements first
        for(int i=0;i<n;i++){
            newElements[i]=elements[i];
        }
        elements=newElements;


    }

//    removing the element
    public int remove(int idx){
        if(idx<0||idx>=size){
            throw new NullPointerException();
        }
        int removedElements=elements[idx];
        for(int i=idx;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        size--;
        return removedElements;
    }



}
