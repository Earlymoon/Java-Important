package CompileTimePolymorphism;

public class Parent {
    void eat(){
        System.out.println("parent is eating");
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
}
