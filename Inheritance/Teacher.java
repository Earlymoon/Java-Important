package Inheritance;

public class Teacher extends Person {
    public Teacher(String name){
        super(name);
        System.out.println("this is teacher constructor");

    }
    void teach(){
        super.eat();
        System.out.println(name+" teacher is teaching");
    }
    void eat(){
        System.out.println("this time teacher "+name+" is eating");
    }

}
