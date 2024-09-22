package Mutlithreading.ThreadCommunication;

import java.util.concurrent.ExecutionException;

public class Test {
    int value;
    boolean valueSet=false;

    public synchronized void put(int value){
        while (valueSet){
            try{
                wait();
            }catch (Exception e){}
        }
        this.value=value;
        System.out.println("Put: "+value);
        valueSet=true;
        notify();
    }
    public synchronized void get(){
        while (!valueSet){
            try{
                wait();
            }catch (Exception e){}
        }
        System.out.println("Get:- "+value);
        valueSet=false;
        notify();
    }
}

