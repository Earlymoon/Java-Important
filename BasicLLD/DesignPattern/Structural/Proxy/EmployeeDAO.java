package BasicLLD.DesignPattern.Structural.Proxy;

public interface EmployeeDAO{

    public void createEmployee(String client ,Employee employee)throws Exception;
    public void deleteEmployee(String client,int id)throws Exception;
    public Employee getEmployee(String client,int id) throws Exception;

}
