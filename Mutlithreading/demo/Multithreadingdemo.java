package Mutlithreading.demo;

class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hiii");
           try{
               Thread.sleep(500);
           }catch (Exception e){}
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
public class Multithreadingdemo {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
//        A and B class extends Thread class hence A, B are now Thread
//        Thread has start method which internally call run method that is why we have to override run method

        obj1.start();
        try{
            Thread.sleep(10);
        }catch (Exception e){}
//        this upper sleep time is given such that thread schedular gives Thread A first to the CPU
//        Then Thread B
        obj2.start();

    }
}
