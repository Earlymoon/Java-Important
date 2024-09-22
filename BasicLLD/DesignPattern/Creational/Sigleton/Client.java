package BasicLLD.DesignPattern.Creational.Sigleton;

import javax.xml.crypto.Data;

public class Client {
    public static void main(String[] args) {
        Database d1=Database.getDatabase();
        System.out.println(d1.hashCode());
        Database d2=Database.getDatabase();
        System.out.println(d2.hashCode());
    }
}
