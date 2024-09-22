package BasicLLD.DesignPattern.Creational.AbstractFactory;

public class AndroidFactory extends AbstractEmployeeFactory {
    public Employee createEmployee(){
        return new AndroidDev();
    }

}
