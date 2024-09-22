package Static;

public class Main {
    public static void main(String[] args) {
//     Counter c1=new Counter();
//     Counter c2=new Counter();
//        Counter c3=new Counter();

        Student.change();
        Student s1=new Student();
        System.out.println(s1.college);
        Student s2=new Student();
        s2.college="nit hamir";
        System.out.println(s1.college);
        System.out.println(s2.college);



    }
}
