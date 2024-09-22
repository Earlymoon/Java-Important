package BasicLLD.DesignPattern.Creational.AbstractFactory;

import BasicLLD.DesignPattern.Creational.Factory.WebDeveloper;

public class WebFactory extends AbstractEmployeeFactory{

    public Employee createEmployee(){
        return  new WebDev();
    }

}
