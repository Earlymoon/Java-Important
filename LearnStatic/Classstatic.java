package LearnStatic;

public class Classstatic {
    public static void main(String[] args) {
        A obja=new A();
        A.B objb=obja.new B();
        A.C objc=new A.C();


    }
}
