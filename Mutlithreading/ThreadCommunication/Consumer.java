package Mutlithreading.ThreadCommunication;

public class Consumer implements Runnable {
    Test test;
    Consumer(Test test){
        this.test=test;
        Thread t2=new Thread(this,"Consumer");
        t2.start();
    }
    public void run(){
        while (true){
            test.get();
            try{
                Thread.sleep(100);
            }catch (Exception e){}
        }
    }
}
