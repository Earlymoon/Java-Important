package BasicLLD.DesignPattern.Creational.Factory;

public class Client {
    public static void main(String[] args) {
//        Employee employee=new SoftwareDeveloper();
//        int salary=employee.salary();
//        System.out.print(" "+salary);
//        here it is tight coupling

        Employee employee=EmployeeFactory.getEmployee("SOFTWARE");
        Employee employee2=EmployeeFactory.getEmployee("WEB");
        System.out.println(employee.salary());
        System.out.println(employee2.salary());


    }
}
