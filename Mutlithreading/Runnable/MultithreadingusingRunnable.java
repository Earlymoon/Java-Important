package Mutlithreading.Runnable;
class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hiii");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}

public class MultithreadingusingRunnable {
    public static void main(String[] args) {
        Runnable obj1=new A();
        Runnable obj2=new B();
        
//        to use runnable method we need start method to run thread anyway hence
//        we need to create two thread separately

//        Java doesn’t support multiple inheritance of classes.
//        If you extend the Thread class, you can’t extend any other class.
//        However, by implementing the Runnable interface,
//        your class can extend another class if needed.
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        try{
            Thread.sleep(10);
        }catch (Exception e){}
        t2.start();
    }
}
