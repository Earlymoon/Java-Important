package BasicLLD.DesignPattern.Creational.Builder;

public class User {

    private final String userName;
    private final String emailId;

    private final String Address;


    private User(UserBuilder userBuilder){
        this.userName=userBuilder.userName;
        this.emailId=userBuilder.emailId;
        this.Address=userBuilder.Address;

    }

    @Override
    public String toString() {
        return getUserName()+" "+getEmailId()+" "+getAddress();
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return Address;
    }


    static class UserBuilder {
        private  String emailId;

        private String userName;
        private  String Address;

        public static UserBuilder getUserBuilder(){
            return new UserBuilder();
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;

            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setAddress(String address) {
            Address = address;
            return this;
        }

        public User build(){
            User user=new User(this);
            return user;
        }
    }
}
