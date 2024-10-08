package BasicLLD.DesignPattern.Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDAO employeeDAO=new EmployeeDaoProxy();
            employeeDAO.createEmployee("ADMIN",new Employee("rahul",1));
            System.out.println("operation successfull");
        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
