package This;

public class Student {
    String name;
    int roll;

    Student(String x,int y){
        name=x;
        roll=y;
    }

    public static void main(String[] args) {
        Student s1=new Student("priya",13);
        System.out.println(s1.name+" "+s1.roll);
    }
}
