package CompileTimePolymorphism;

import CompileTimePolymorphism.Parent;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Parent.sum);
//        we can overload static method also
        Parent parent=new Parent();
        System.out.println(parent.sum(1,2));
        System.out.println(parent.sum(1,2,3));
    }
}
