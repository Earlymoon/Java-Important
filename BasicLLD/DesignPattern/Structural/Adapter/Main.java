package BasicLLD.DesignPattern.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        AppleCharger appleCharger=new Adapter(new DKCharger());
       Iphone iphone=new Iphone(appleCharger);

       iphone.chargephone();

    }
}
