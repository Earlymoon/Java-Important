package BasicLLD.DesignPattern.Creational.Builder;

public class Client{
    public static void main(String[] args) {
        User user1= User.UserBuilder
                .getUserBuilder()
                .setUserName("chandra")
                .setEmailId("Chandra@gmail.com")
                .setAddress("NIT D")
                .build();

        System.out.println(user1);


    }
}
