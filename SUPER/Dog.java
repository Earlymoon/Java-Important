package SUPER;

public class Dog extends Animal{
    Dog(){
//        here by default super() is called which calls the parent constructor
        System.out.println("dog is eating");
    }
    void run(){
        System.out.println("dog is running");
    }
}
