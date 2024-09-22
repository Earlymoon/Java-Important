package LLDtut;

public class Student {
    int age;
    String name;
    Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    Student(Student other){
        age=other.age;
        name=other.name;
    }
}
