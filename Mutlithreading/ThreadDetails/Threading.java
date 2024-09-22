package Mutlithreading.ThreadDetails;

import java.sql.SQLOutput;

public class Threading  {
    public static void main(String[] args) throws Exception {
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
        },"prakash");

        t1.start();
        try{
            Thread.sleep(10);
        }catch (Exception e){}
        t2.start();

//        set name of the thread
        t1.setName("cp thread 1");
//        t2.setName("cp thread 2");

//        GET NAME OF THE THREAD
        System.out.println(t1.getName());
        System.out.println(t2.getName());

//        get the priority
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

//        Java thread priorities range from 1 (lowest priority) to 10 (highest priority).
//The constants Thread.MIN_PRIORITY, Thread.NORM_PRIORITY, and Thread.MAX_PRIORITY represent the values 1, 5, and 10, respectively.

        t1.setPriority(1);
//        t1.setPriority(Thread.MAX_PRIORITY);  // other way to set
        t1.setPriority(Thread.NORM_PRIORITY);  // 5
        t2.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());




    }
}

