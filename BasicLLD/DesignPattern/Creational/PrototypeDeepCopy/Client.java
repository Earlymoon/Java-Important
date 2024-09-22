package BasicLLD.DesignPattern.Creational.PrototypeDeepCopy;

import BasicLLD.DesignPattern.Creational.PrototypeDeepCopy.NetworkConnection;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("creating an object for the network connection");
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp("192.168.1.1");
        networkConnection.loadImportantData();


        System.out.println("networkconnection: "+networkConnection);


        try{
            NetworkConnection networkConnection1=(NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection2=(NetworkConnection) networkConnection.clone();

//            removing some domain name from the original networkconnection
            networkConnection.getDomains().remove(0);

//            After removing
            System.out.println("after remoing from original connection");
            System.out.println(networkConnection);
            System.out.println(networkConnection1);
            System.out.println(networkConnection2);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }


    }
}
