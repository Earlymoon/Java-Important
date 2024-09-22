package BasicLLD.DesignPattern.Behavioral.Iterative;

public class Main {
    public static void main(String[] args) {
       UserManagement userManagement=new UserManagement();
       userManagement.addUser(new User("chandra","13"));
       userManagement.addUser(new User("rahul","14"));
       userManagement.addUser(new User("satyam","48"));
       userManagement.addUser(new User("vishal","64"));
       userManagement.addUser(new User("abhi","01"));


       MyIterator iterator=userManagement.getIterator();

       while(iterator.hasNext()){
           User user=(User)iterator.next();
           System.out.println(user.getUserName());
       }
    }
}
