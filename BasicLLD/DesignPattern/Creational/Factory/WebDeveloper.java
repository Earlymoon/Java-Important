package BasicLLD.DesignPattern.Creational.Factory;

public class WebDeveloper implements Employee{
    public int salary(){
        System.out.println("Web Developer salary");
        return 400000;
    }
}
