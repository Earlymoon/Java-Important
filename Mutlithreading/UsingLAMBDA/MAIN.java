package Mutlithreading.UsingLAMBDA;

public class MAIN {
    public static void main(String[] args)throws Exception {
       Thread t1=new Thread(()-> {
           for (int i = 0; i < 5; i++) {
               System.out.println("hitt");
               try {
                   Thread.sleep(500);
               } catch (Exception e) {
               }

           }
       });

        Thread t2=new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hellow");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }

            }
        });

        t1.start();
       try{
           Thread.sleep(10);
       }catch (Exception e){}
       t2.start();




//       now we see the use of join method
//        this line will execute in any sense because main thread is free now to stop this we first have
//        have to kill the thread t1 or t2 using join method


        t1.join();//main thread wait for the exexution of thread t1 to finish
        t2.join();//main thread wait for the
        System.out.println("checking if Thread t1 is alive or not?"+ t1.isAlive());
        System.out.println("checking if Thread t1 is alive or not?"+ t1.isAlive());
        System.out.println("byeeeee");
    }
}
