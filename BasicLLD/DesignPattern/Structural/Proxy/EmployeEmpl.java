package BasicLLD.DesignPattern.Structural.Proxy;

public class EmployeEmpl implements EmployeeDAO{

    @Override
    public void createEmployee(String client, Employee employee) throws Exception {
        System.out.println("employee created");

    }

    @Override
    public void deleteEmployee(String client, int id) throws Exception {
        System.out.println("employee deleted");
    }

    @Override
    public Employee getEmployee(String client, int id) throws Exception {
        System.out.println("returning employee");
        return new Employee(client,id);
    }
}
