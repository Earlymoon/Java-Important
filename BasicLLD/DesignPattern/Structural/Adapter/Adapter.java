package BasicLLD.DesignPattern.Structural.Adapter;

public class Adapter implements AppleCharger{

    private AndroidCharger charger;
    Adapter(AndroidCharger androidCharger){
        this.charger=androidCharger;
    }

    public void chargeIPhone(){
        charger.chargeAndroidPhone();
        System.out.println("Iphone is charging using android charger");
    }

}
