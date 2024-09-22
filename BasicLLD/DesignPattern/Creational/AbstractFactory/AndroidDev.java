package BasicLLD.DesignPattern.Creational.AbstractFactory;

public class AndroidDev implements Employee{
    public int salary(){
        System.out.println("android dev salary is ");
        return 5000000;
    }

    public String name(){
        System.out.println("Android developer");
        return "AndroidDev";
    }
}
