package BasicLLD.DesignPattern.Creational.AbstractFactory;

public class EmployeeFactory {

    public static Employee getEmployee(AbstractEmployeeFactory factory){
        return factory.createEmployee();
    }
}
