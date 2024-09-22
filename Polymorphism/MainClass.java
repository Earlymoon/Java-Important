package Polymorphism;

public class MainClass {
    public static void main(String[] args) {
        //run time polymorphism  ->as we know which method  is call at the runtime only
//        Dog d=new Dog();
//        Pet p=d;
//        Animal a=d;
//        d.walk();
//        p.walk();
//        a.walk();


//        compile time polymorphism
//        we make a function in mainclass itself  ->simple it is a method overloading
        greeting();
        greeting("chandraaaa");
    }
    public static   void greeting(){
        System.out.println("hi there!");
    }
    public static void greeting(String name){
        System.out.println(name);
    }
}
