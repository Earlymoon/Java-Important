package Mutlithreading.ThreadCommunication;

public class Producer implements  Runnable {
    Test test;
    Producer(Test test){
        this.test=test;
        Thread t1=new Thread(this,"Producer");
        t1.start();
    }

    public void run(){
        int i=0;
        while(true){
         test.put(i++);


         try{
             Thread.sleep(100);
         }catch (Exception e){}
        }
    }
}
