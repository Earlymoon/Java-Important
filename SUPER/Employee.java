package SUPER;

public class Employee extends Person{
    int salary;
    Employee(int id,String name,int salary){
        super(id,name);
        this.salary=salary;
    }
}
