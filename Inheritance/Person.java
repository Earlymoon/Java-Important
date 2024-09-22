package Inheritance;

public class Person {
    protected String name;
    public Person(String name){
        this.name=name;
    }

    void eat(){
        System.out.println("person "+name+ " is eating");
    }
    void walk(){
        System.out.println("person "+name+ " walking");
    }
}
