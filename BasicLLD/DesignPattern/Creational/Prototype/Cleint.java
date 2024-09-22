package BasicLLD.DesignPattern.Creational.Prototype;

public class Cleint {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using prototype design pattern");
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp("192.10.10.1");
        networkConnection.loadImportantData();
        System.out.println(networkConnection);

        NetworkConnection networkConnection11=new NetworkConnection();
        networkConnection11.setIp("133.133");
        networkConnection11.loadImportantData();
        System.out.println(networkConnection11);


        try{
            Thread.sleep(5000);
            NetworkConnection networkConnection1=(NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection2=(NetworkConnection) networkConnection11.clone();
            System.out.println(networkConnection1);
            System.out.println(networkConnection2);

        }catch (CloneNotSupportedException e){e.printStackTrace();}

    }
}
