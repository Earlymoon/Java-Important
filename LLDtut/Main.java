package LLDtut;

public class Main {
    public static void main(String[] args) {
        Student chandra=new Student(21,"chandra");
        Student chandraCopy=new Student(chandra);
        System.out.println("chandra ->"+chandra.age+" "+chandra.name);
        System.out.println("chandraCopy ->"+chandraCopy.age+" "+chandraCopy.name);
        System.out.println("---------------");
        chandra.name="priya";
        chandra.age=30;
        System.out.println("chandra ->"+chandra.age+" "+chandra.name);
        System.out.println("chandraCopy ->"+chandraCopy.age+" "+chandraCopy.name);


    }
}
