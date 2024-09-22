package BasicLLD.DesignPattern.Creational.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Employee e1=EmployeeFactory.getEmployee(new AndroidFactory());

        e1.name();

        int salary=e1.salary();
        System.out.println(salary);

    }
}
