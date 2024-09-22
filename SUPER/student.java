package SUPER;

public class student {

    student(){
        System.out.println("student constructor");
    }
    student(int roll){
        System.out.println("student roll number is "+roll);
    }
    void read(){
        System.out.println("reading");
    }

}
class school extends student{
    school(){
        //super must be the first statement in the constructor body
        super(13);
        System.out.println("school costructor");

    }
    void func(){
        System.out.println("school class");
        super.read();
    }
}
