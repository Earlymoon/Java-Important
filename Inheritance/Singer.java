package Inheritance;

public class Singer extends Person{
    public Singer(String name){
        super(name);
        System.out.println("singer constructor");
    }
    void sing(){
        System.out.println("singer is singing");
    }
}
