package BasicLLD.DesignPattern.Creational.Factory;

public class EmployeeFactory {

    public static Employee getEmployee(String employe){
        if(employe.trim().equalsIgnoreCase("SOFTWARE")){
            return new SoftwareDeveloper();
        }
        else if(employe.trim().equalsIgnoreCase("WEB")){
            return new WebDeveloper();
        }
        else return null;
    }
}
