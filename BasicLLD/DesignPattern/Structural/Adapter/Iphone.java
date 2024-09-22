package BasicLLD.DesignPattern.Structural.Adapter;

public class Iphone {
    public AppleCharger appleCharger;
    Iphone(AppleCharger appleCharger){
        this.appleCharger=appleCharger;
    }

    public void chargephone(){
        appleCharger.chargeIPhone();
    }
}
