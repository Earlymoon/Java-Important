package BasicLLD.DesignPattern.Structural.Proxy;

public class EmployeeDaoProxy implements EmployeeDAO{

    EmployeEmpl employeEmpl;
    public EmployeeDaoProxy(){
        this.employeEmpl=new EmployeEmpl();
    }
    @Override
    public void createEmployee(String client, Employee employee) throws Exception {
        if(client.equals("ADMIN")){
            employeEmpl.createEmployee(client, employee);
            return;
        }
        throw new Exception("Only admin can create employee");
    }

    @Override
    public void deleteEmployee(String client, int id) throws Exception {
         if(client.equals("ADMIN")){
             employeEmpl.deleteEmployee(client,id);
             return;
         }
         throw new Exception("Only admin can delete employee");
    }

    @Override
    public Employee getEmployee(String client, int id) throws Exception {
        if(client.equals("ADMIN")||client.equals("USER")){
            return employeEmpl.getEmployee(client,id);
        }
        throw  new Exception("Access denied");
    }
}
