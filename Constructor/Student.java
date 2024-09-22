package Constructor;

public class Student {
    int age;
    String name;
    Student(int a,String b){
        age=a;
        name=b;
    }
    void print(){
        System.out.println("name "+name+" "+"age "+age);
    }
}
